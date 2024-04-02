class university{

	String uniName;
	String address;

	university(String name , String add){

		uniName = name;
		address = add;
		}

	}


class student extends university{

	String stuName;
	String address;
	int age;
	int sem;
	student(String name , String add,String stuName, int age , int sem){
		super(name ,  add);
		this.stuName = stuName;
		this.age = age;
		this.sem = sem;
		}

	void display(){System.out.println(this.uniName+"\t"+this.address+"\n"+this.stuName+"\t"+this.age+"   "+this.sem);}

	}
public class inheritence{

	public static void main(String [] str){

         student me = new student("Comsats","Abbottabad","Murtaza",21,3);
         me.display();	 

		}
	}