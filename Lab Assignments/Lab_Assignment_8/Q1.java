package Lab_Assignment_8;

import java.util.Scanner;
class employee{
	
	int emp_id;
	int scale;
	Scanner inp = new Scanner(System.in);
	
	void input(){

        System.out.print("Enter Employee ID : ");
        emp_id=inp.nextInt();

        System.out.print("Enter Employee Scale : ");
        scale=inp.nextInt();

    }

    void show(){
        System.out.println("Employee ID : "+emp_id+"\nEmployee Scale : "+scale);
    }
	
	}

    class manager extends employee{

        int man_id;
        String department;

        void input(){
        super.input();

        System.out.print("Enter Manager ID : ");
        man_id=inp.nextInt();
        inp.nextLine();
        System.out.print("Enter Manager Department : ");
        department=inp.nextLine();

        }

        void show(){
            super.show();
            System.out.println("Manager ID : "+man_id+"\nDepartment : "+department);
        }

    }

public class Q1{
	public static void main(String [] str){	
		manager person = new manager();
        person.input();
        person.show();}}
