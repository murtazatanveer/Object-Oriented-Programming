 interface phone{

    void display(float inch);

    void battery(int mah);

    void colour(String col);

    void processing(int ram,int rom,float p);

    void dsplaySpecifications();

    boolean isAvailable=true;

    interface owner {

    void name(String name);
    void age(int age);
    void address(String address);
       
    }

}

interface applications{

    void socialMedia();

    void paymentApps();

    void camera();

    void gamingApplication();

}

 class oppo implements phone ,phone.owner, applications {


    float inch,mah,ram,rom,processor;

    private String name,address;

    private int rate,age;

    String colour;

    public void display(float inch){this.inch=inch;}

    public void battery(int mah){this.mah=mah;}

    public void colour(String col){this.colour=col;}

    public void processing(int ram,int rom,float p){
        this.ram=ram;
        this.rom=rom;
        this.processor=p;
    }


    public void dsplaySpecifications(){

        System.out.println("Display : "+inch+" Inch\nBattery : "+mah+" mah\nColour : "+colour);
        System.out.println("Ram : "+ram+" GB\nRom : "+rom+" GB\nProcessor : "+processor);
        System.out.println("Availibility : "+isAvailable);

    }

    public void camera(){System.out.println("Camera is Working");}

    public void socialMedia(){
		System.out.println("Facebook Installed Successfully\nWhatsApp Installed Successfully");
		}

	public void paymentApps(){
		System.out.println("Easypaisa and Sadapay Installed Successfully");
		}

	public void gamingApplication(){
		System.out.println("PUBG Installed successfully");
		}

    int rateings(int r){
        this.rate = r;
        return this.rate;
    }
    
   public void name(String name){this.name=name;}

   public void address(String address){this.address=address;} 

   public void age(int age){this.age=age;}

   void displayOwnerDetails(){
    System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nAddress : "+this.address);
   }
}



public class interfaces_ {

    public static void main(String[] args) {

         oppo myMobile = new oppo();

        // myMobile.display(5.5f);

        // myMobile.battery(5000);

        // myMobile.processing(4, 32,2.3f);

        // myMobile.colour("Blue");

        // myMobile.dsplaySpecifications();

        // myMobile.socialMedia();

        // myMobile.gamingApplication();

        myMobile.name("Murtaza");
        myMobile.age(21);
        myMobile.address("Jhelum");

        //We take the reference of interface.
        //But we can access only methods of interface of which we take reference.
        //We cannot access class methods in which interface is implemented or other interfaces implemeted in that class.
        //For example

        // applications apps = new oppo();

        // apps.paymentApps();

        // //apps.display(); ERROR!

        // apps.gamingApplication();

        
    }

}
