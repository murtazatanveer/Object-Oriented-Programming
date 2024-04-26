package Lab_Assignment_6;

import java.util.Scanner;

class printer{

    private int id = 10;
    private String name;
    private int pages;
    private String department;
    static int count=0;
    static int entries=0;

    Scanner inp = new Scanner(System.in);

    void get(){

        System.out.print("Enter Employee name : ");
        name = inp.nextLine();

        id=(int)(Math.random()*1000);

        System.out.print("\nEnter Employee Department (CS , SE or BBA): ");
        department = inp.nextLine();

        System.out.print("Enter Pages you want to use : ");
        pages = inp.nextInt();

        count += pages;

        System.out.println("Your ID is "+id);

        }

        void csPages(printer [] p){

            int totalPages=0;

            for(int i=0;i<entries;i++){
                if(p[i].department.equals("CS")){

                    System.out.println("Faculty Member "+p[i].name+" has taken "+p[i].pages+" Pages.");
                    totalPages+=p[i].pages;

                }
            }

            if(totalPages==0){System.out.println("No Pages used by CS department");return;}

            System.out.println("\nTotal Pages Used By CS Department are "+totalPages);

            System.out.println("\nTotal Pages Used By all Departments are "+count);

        }

        void sePages(printer [] p){

            int totalPages=0;

            for(int i=0;i<entries;i++){
                if(p[i].department.equals("SE")){

                    System.out.println("Faculty Member "+p[i].name+" has taken "+p[i].pages+" Pages.");
                    totalPages+=p[i].pages;

                }
            }

            if(totalPages==0){System.out.println("No Pages used by SE department");return;}

            System.out.println("\nTotal Pages Used By SE Department are "+totalPages);

             System.out.println("\nTotal Pages Used By all Departments are "+count);

        }

        void bbaPages(printer [] p){

            int totalPages=0;

            for(int i=0;i<entries;i++){
                if(p[i].department.equals("BBA")){

                    System.out.println("Faculty Member "+p[i].name+" has taken "+p[i].pages+" Pages.");
                    totalPages+=p[i].pages;

                }
            }

            if(totalPages==0){System.out.println("No Pages used by BBA department");return;}

            System.out.println("\nTotal Pages Used By BBA Department are "+totalPages);

            System.out.println("\nTotal Pages Used By all Departments are "+count);

        }

        void memberPages(printer [] p){

			System.out.print("Enter Your ID : ");

			int d = inp.nextInt();

			for(int i=0;i<entries;i++){

				if(d==p[i].id){
					System.out.println("Pages Used By "+p[i].name+" is "+p[i].pages+"\nDepartment  : "+p[i].department);
					return;
					}
				}

				System.out.println("ID doesnot Exist in Record");

			}

    }

    public class Q3{
        public static void main(String[]str){

            printer []user = new printer[10];

            int choice;

            printer main = new printer();

            Scanner inp = new Scanner(System.in);

            do{

			System.out.print("\n\n1.  Register Yourself.\n2.  Check Pages Used By Whole Department.\n3.  Check Pages Used By Single Member.\n4.  Exit.\n\nChoice : ");
            choice=inp.nextInt();

            switch (choice) {
                case 1:

                user[printer.entries]=new printer();
			    user[printer.entries].get();
                printer.entries++;

                break;

                case 2:

                inp.nextLine();
                System.out.print("\nEnter Department (CS , SE or BBA) : ");
				String dep=inp.nextLine();

				if(dep.equals("CS")){main.csPages(user);}

				else if(dep.equals("SE")){main.sePages(user);}

                else{main.bbaPages(user);}

                break;

                case 3:
                main.memberPages(user);
				break;

                case 4:
                System.out.println("\nEXITTING.....");
                break;

                default:
                System.out.println("\nInvalid Choice");
                break;
            }
        }while(choice!=4);

        inp.close();

            }
        }


