
public class Q1{
	public static void main(String [] str){

        book b = new book();
        b.set("Object Oriented Programming",1500,400);
        b.display();

        tape t = new tape();
        t.set("Hindi Songs", 800,25);
        t.display();

		}
	}

class publication{

	String title;
	int price;

	String getTitle(){return title;}

	int getPrice(){return price;}

	void set(String title,int price){

		this.title=title;
		this.price=price;

		}

	void display(){
		System.out.print("Title : "+getTitle()+"\nPrice : Rs "+getPrice());

		}

	}

class book extends publication{
	
	int pages;
	
	void set(String title , int price , int pages){
        super.set(title, price);
        this.pages=pages;
    }

    int getPages(){return pages;}

    void display(){
        super.display();
        System.out.print("\nTotal Pages : "+getPages()+"\n\n");
    }
	
	}

    class tape extends publication{
	
        int playingTime;
        
        void set(String title , int price , int playingTime){
            super.set(title, price);
            this.playingTime=playingTime;
        }
    
        int getPlayingTime(){return playingTime;}
    
        void display(){
            super.display();
            System.out.print("\nPlaying Time : "+getPlayingTime()+" minutes\n\n");
        }
        
        }
