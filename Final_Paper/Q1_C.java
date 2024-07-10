package Final_Paper;

class movie{
    private String title , studio , rating;

    movie( String title , String studio , String rating){

        this.title = title;
        this.studio=studio;
        this.rating=rating;

    }
    
    movie( String title , String studio){

        this.title = title;
        this.studio=studio;
        this.rating="PG";

    }
    

    void getPG(movie [] mov){

        for (int i = 0; i < mov.length; i++) {

            if(mov[i]==null){
                continue;
            }

            if(!(mov[i].rating.equals("PG"))){
                mov[i]=null;
            }
            
        }

    }

}

public class Q1_C {
    public static void main(String[] args) {

        movie []arr = new movie[8];

        movie ob = new movie(null, null);

        for (int i = 0; i < 3; i++) {
            arr[i]=new movie("abc", "abc", "abc");
        }

        for (int i = 3; i < arr.length; i++) {
            arr[i]=new movie("with pg", "with pg");
        }



        

        
        
        
    }
}




