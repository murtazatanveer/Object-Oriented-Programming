package Lab_Assignment_4;

class matrix{

	int row;
	int col;
	int [][] matrix = new int[row][col];
	int sumRowCol=0,dia=0;

	matrix(int r,int c){
		row = r;
		col=c;
		}

	void fillMatrix(){

		for(int i = 0;i<row;i++){
			for(int j = 0;j<col;j++){

				matrix[i][j] = (int)(Math.random() * 100);

				}
			}


		}

		void result(){

			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){

					sumRowCol += matrix[i][j];

					if(i==0 || i==(row-1)){dia += matrix[i][j];}

					}
				}


			}

		void display(){

			System.out.println("Sum of Rows and Columns                  : "+sumRowCol);
			System.out.println("Sum of Above Diagonal and Below Diagonal : "+dia);

			}

	}

public class Q4{

	public static void main(String []str){

		matrix m = new matrix(5,7);

		m.fillMatrix();
		m.result();
		m.display();

		}

	}

