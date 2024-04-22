package Assignments;
import java.util.Scanner;
class timber{

	char zone;

	int timberId;

	String kind;

	float weight;

	float height;

	int quantity;

	int price;

	timber(char zone,int timberId,String kind,float weight,float height,int quantity,int price){

		this.zone=zone;

	    this.timberId=timberId;

		this.kind=kind;

		this.weight=weight;

		this.height=height;

	    this.quantity=quantity;

	    this.price=price;


		}


	void displayRecord(){

		System.out.println("\nZone :      "+zone+"\nTimber Id : "+timberId+"\nKind :      "+kind);
		System.out.print("Weight :    "+weight+"\nHeight :    "+height+"\nQuantity :   "+quantity+"\nPrice :      "+price+"\n\n");

		}


	}

public class Assignment_No_1{

	static timber[] tree = new timber[10];

	static Scanner inp = new Scanner(System.in);

	static int choice;

	static int j=0;

    static int count = 0;

    static char zone;

    static int id;

    static String kind;

    static float weight;

    static float height;

    static int quantity;

    static int price;

	public static void main(String [] str){


		do{

            displayList();

			System.out.print("\nEnter Choice : ");
			choice = inp.nextInt();

			switch(choice){

				case 1 :
                addTimberRecords();
                break;

                case 2:
                displayZoneRecords();
				 break;

				 case 3 :
                displayKindRecords();
                break;

				 case 4 :
                analysis();
				 break;

				 case 5:
				 salesUpdate();
				 break;

				 case 6 :
				 deleteRecord();
				 break;

				 case 7 :
				 updateRecord();
				 break;

				 case 8 :
				 System.out.println("\nExitting.....");
				 break;

				 default :
				 System.out.println("Invalid Choice! Try Again");

				}

			}while(choice!=8);


		}

        static void displayList(){

            System.out.println("\n\n[1].  Add a new Timber records");
			System.out.println("[2].  Display all records for a given Zone");
			System.out.println("[3].  Display a particular record given the Kind");
			System.out.println("[4].  Analysis of record level");
			System.out.println("[5].  Sales update Report");
			System.out.println("[6].  Delete a particular Timber record");
			System.out.println("[7].  Update a particular Timber record");
			System.out.println("[8].  Exit");

        }

        static void addTimberRecords(){

            System.out.println("\nEnter Requirements of a Timber");

            System.out.print("\nZone : ");
            zone = inp.next().charAt(0);

            id = (int) (Math.random() * 990) + 10;

            inp.nextLine();

            System.out.print("\nKind : ");
            kind = inp.nextLine();

            System.out.print("\nWeight : ");
            weight = inp.nextFloat();

            System.out.print("\nHeight : ");
            height = inp.nextFloat();

            System.out.print("\nQuantity : ");
            quantity = inp.nextInt();

            System.out.print("\nPrice : ");
            price = inp.nextInt();

            System.out.println("\nTimber Id is : "+id+"\n");

            tree[j]=new timber(zone,id,kind,weight,height,quantity,price);

            j++;

        }

        static void displayZoneRecords(){

            System.out.print("\nEnter Zone : ");
            zone = inp.next().charAt(0);
            System.out.println("\nAll records of given zone are : \n");
            int i;
            count=0;
            for(i=0;i<j;i++){

                if(tree[i].zone==zone){
                    tree[i].displayRecord();
                    count++;
                    }

                }

             if(count==0){System.out.println("Error! Records does not exist for given zone.\n");}

        }


        static void displayKindRecords(){

            inp.nextLine();
            System.out.print("\nEnter Kind : ");
            kind = inp.nextLine();
            int i;
            for(i=0;i<j;i++){

              if (tree[i].kind.equals(kind)) {
                    tree[i].displayRecord();
                    return;
                   }

           }

           System.out.println("Error! Record does not exist for given kind.\n");

        }

        static void analysis(){

            System.out.println("\nAll Records where quantity on hand is lower than 100 are : \n");
            count=0;
            int i;
            for(i=0;i<j;i++){

                if(tree[i].quantity<100){
                     tree[i].displayRecord();
                     count++;
                       }

                   }

           if(count==0){System.out.println("Error! Doesnot found any Record where quantity on hand is lower than 100\n");}



        }

        static void salesUpdate(){

			System.out.print("\n\nEnter Timber ID : ");
			id = inp.nextInt();

			int quantity;

            int i;
			for(i=0;i<j;i++){

				if(tree[i].timberId==id){

					System.out.print("\nEnter Quantity to be Sold : ");
					quantity = inp.nextInt();

					 if(quantity > tree[i].quantity){
						 System.out.println("Error! Quantity to be sold is more than Quantity on hand");
						 }else{

							 tree[i].quantity = tree[i].quantity - quantity;

							 System.out.println("\nQuantity Updated Successfully\n");

							 tree[i].displayRecord();

							 }

					 break;
					}

				}

			if(i==j){System.out.println("Error! Record does not exist for given Timber ID.\n");}

			}

		static void deleteRecord(){

            timber[] copyTree = new timber[10];

            System.out.print("\n\nEnter Timber ID : ");
			id = inp.nextInt();

			int i;
			int m=0;
			for(i=0;i<j;i++){

				if(id==tree[i].timberId){

					System.out.println("Timber Record of ID "+ tree[i].timberId+" Deleted Successfully\n");
					tree[i]=null;

					for(int k=0;k<j;k++){

						if(i!=k){
							copyTree[m]=tree[k];
							m++;
						  }

						}
					break;

					}

				}

				if(i==j){
					System.out.println("Error! Record does not exist for given Timber ID.\n");
					return;
				}

            j--;
            tree[j]=null;

            for(int k=0;k<j;k++){tree[k]=copyTree[k];}

			}


			static void updateRecord(){

			System.out.print("\n\nEnter Timber ID : ");
			id = inp.nextInt();

			int i;
			for(i=0;i<j;i++){

				if(id==tree[i].timberId){

					System.out.println("\nEnter Requirements of a Timber");

					 System.out.print("\nZone : ");
                     tree[i].zone = inp.next().charAt(0);

                     inp.nextLine();

					 System.out.print("\nKind : ");
					 tree[i].kind = inp.nextLine();

					 System.out.print("\nWeight : ");
					 tree[i].weight = inp.nextFloat();

					 System.out.print("\nHeight : ");
					 tree[i].height = inp.nextFloat();

					 System.out.print("\nQuantity : ");
					 tree[i].quantity = inp.nextInt();

					 System.out.print("\nPrice : ");
					 tree[i].price = inp.nextInt();

					 break;
					}

				}

			}

	}



