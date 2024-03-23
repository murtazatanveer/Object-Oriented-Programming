package Arrays.Two_D_Arrays;


public class twoDArrays {

    public static void main(String[] args) {
        
        printStar();


    }

     static void printStar(){

        char star[][] = new char[5][5];

		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){

				if(i>=j){

					star[i][j]='*';

					}else{

					star[i][j]=' ';

						}

				}

			}

			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){

					System.out.print(star[i][j]);

					}
					System.out.println();
				}

     }
    
}

