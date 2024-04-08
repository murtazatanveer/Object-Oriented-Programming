package Lab_Assignment_4;

class employee{

    int salary;
    int hoursPerDay;
    
       void getInfo(int sal,int hours){
    
        salary = sal;
        hoursPerDay = hours;
    
        }
    
       void addSalary(){
    
           if(salary<50000){salary += 1000;}
    
           }
    
        void addWork(){
    
            if(hoursPerDay>6){salary += 500;}
    
            }
    
    
        }
    
    
    public class Q3{
    
        public static void main(String [] str){
    
            employee emp = new employee();
    
            emp.getInfo(40000,7);
    
            emp.addSalary();
            emp.addWork();
    
            System.out.println("Salary        : "+emp.salary);
            System.out.println("Hours Per Day : "+emp.hoursPerDay);
    
            }
        }
    