interface phone{

    void display(float inch);

    void battery(int mah);

    void colour(String col);

    void processing(int ram,int rom,float p);

    void dsplaySpecifications();

    boolean isAvailable=true;

}

 class oppo implements phone{

    float inch,mah,ram,rom,processor;

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

}


public class interfaces {

    public static void main(String[] args) {
        
        oppo myMobile = new oppo();

        myMobile.display(5.5f);

        myMobile.battery(5000);

        myMobile.processing(4, 32,2.3f);

        myMobile.colour("Blue");

        myMobile.dsplaySpecifications();
    }
    
}
