import java.util.Scanner;
class result{

	String name;
	int regNo;
	int [] marks = new int[5];

	Scanner s = new Scanner(System.in);

	void input(){

		System.out.print("Enter Your Name : ");
		name=s.nextLine();

		System.out.print("Enter Your Registration No : ");
		regNo=s.nextInt();

		System.out.print("Enter Marks of 5 subjects with Spaces : ");

		for(int i=0;i<5;i++){marks[i]=s.nextInt();}

		}

		void display(){

			System.out.print("\nName : "+name+"\nReg no : "+"\nMarks of 5 subjects are : ");
			for(int i=0;i<5;i++){System.out.print(marks[i]+"  ");}
			System.out.println("Total Marks are : "+total());

			}

		int total(){

			int sum=0;

			for(int i=0;i<5;i++){
				sum += marks[i];
				}
			return sum;
		}

		void Max_Min(result [] stu){

			int min=stu[0].total(),max=stu[0].total();
			int loc_min=0;
			int loc_max=0;

            

			for(int i=1;i<stu.length;i++){

				if(stu[i].total()>max){
					max=stu[i].total();
					loc_max=i;
					}
				else if(stu[i].total()<min){
					min=stu[i].total();
					loc_min=i;
					}

				}

				System.out.println("Student with Maximum Marks is : ");
				stu[loc_max].display();

				System.out.println("Student with Minimum Marks is : ");
				stu[loc_min].display();

			}

	}

public class Q2{
	public static void main(String [] str){

		result [] students = new result[3];

		for(int i=0;i<students.length;i++){

			students[i]=new result();

			students[i].input();

			}

		result runMinMax = new result();

		runMinMax.Max_Min(students);

		}
	}
