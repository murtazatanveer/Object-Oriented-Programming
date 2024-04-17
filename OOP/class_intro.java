class box{

    int length=10;
    int width;
    int height;

    // Methods in a class

    int calcVolume(int l , int w , int h){
     return l * w * h;
           }

    void setValues(int l , int w , int h){

        length = l;
        width = w;
        height = h;

        }

    }

public class class_intro{

    public static void main(String [] str){

        // creating an object

        box obj = new box();

         obj.length = 10;
         obj.width = 20;
         obj.height = 7;

        int volume = obj.length * obj.width * obj.height;

        System.out.println("Volume : "+volume);

        // Calling methods from class "box"

        volume = obj.calcVolume(5,8,11);

        System.out.println("Volume : "+volume);

        obj.setValues(3,6,9); // changing the values length , width , height

         volume = obj.length * obj.width * obj.height;

        System.out.println("Volume : "+volume);

        box []b = new box[30];

        //for(int i=0;i<5;i++){b[i]=new box();}
        System.out.println(b.length);

        }

    }
