package Lab_Assignment_2;

import java.util.Scanner;
public class shapes{

	public static void main(String [] str){

		Scanner inp = new Scanner(System.in);

        System.out.print("Enter size of your shapes : ");
        int size = inp.nextInt();

        inp.close();

        System.out.println("\n");

		// Shape : 1

		for(int i=1;i<=size;i++){
			for(int j=1;j<=size;j++){

				System.out.print("*");

				}

				System.out.println();

			}

			System.out.println("\n");

					// Shape : 2

			for(int i=1;i<=size;i++){
					for(int j=1;j<=size;j++){

			         if(i>=j){
						System.out.print("*");}

					else{System.out.print(" ");}

							}

							System.out.println();

			}

      System.out.println("\n");

					// Shape : 3

					for(int i=1;i<=size;i++){
						for(int j=1;j<=size;j++){

			                 if(j>=i){
							System.out.print("*");}

							else{System.out.print(" ");}

							}

							System.out.println();

			}

               System.out.println("\n");

					// Shape : 4

					for(int i=size;i>=1;i--){
						for(int j=1;j<=size;j++){

			                 if(i>=j){
							System.out.print("*");}

							else{System.out.print(" ");}

							}

							System.out.println();

			}

			 System.out.println("\n");

								// Shape : 5

								for(int i=size;i>=1;i--){
									for(int j=1;j<=size;j++){

						                 if(j>=i){
										System.out.print("*");}

										else{System.out.print(" ");}

										}

										System.out.println();

			}

          System.out.println("\n");

		  					// Shape : 6

		  					for(int i=1;i<=size;i++){
		  						for(int j=1;j<=size;j++){

		  			                 if((i==j) || (i==1) || (i==size)|| (j==1)|| (j==size)){
		  							System.out.print(" *");}

		  							else{System.out.print("  ");}

		  							}

		  							System.out.println();


			}

			System.out.println("\n");

								  					// Shape : 7

						for(int i=1;i<=size;i++){
							for(int j=1;j<=size;j++){
		
                                if((j==(size+1)-i) || (i==1) || (i==size)|| (j==1)|| (j==size)){
		  							System.out.print(" *");}

                                    else{System.out.print("  ");}

			  							}
        		  							System.out.println();


			}


			System.out.println("\n");

					  					// Shape : 8

					  					for(int i=1;i<=size;i++){
					  						for(int j=1;j<=size;j++){

					  			                 if((i==(size+1)-i) || (i==1) || (i==size)|| (j==1)|| (j==size)){
					  							System.out.print(" *");}

					  							else{System.out.print("  ");}

					  							}

					  							System.out.println();


			}


			System.out.println("\n");

											  		// Shape : 9

											  			for(int i=1;i<=size;i++){
											  				for(int j=1;j<=size;j++){

											  			           if((j==(size+1)-i) || (i==j)){

											  			      	System.out.print(" *");}

											  				   else{System.out.print("  ");}

											  							}

											  					System.out.println();


			}



			System.out.println("\n");

					  					// Shape : 10

					  					for(int i=1;i<=size;i++){
					  						for(int j=1;j<=size;j++){

					  			                 if((i==j) || (i==1) || (i==size)|| (j==1)|| (j==size) || (j==(size+1)-i)){
					  							System.out.print(" *");}

					  							else{System.out.print("  ");}

					  							}

					  							System.out.println();


			}




		  System.out.println("\n");

				  					// Shape : 11

				  					for(int i=1;i<=size;i++){
				  						for(int j=1;j<=size;j++){

				  			                 if((i==1) || (i==size)|| (j==1)|| (j==size)){
				  							System.out.print(" *");}

				  							else{System.out.print("  ");}

				  							}

				  							System.out.println();


			}

             System.out.println("\n");
			        // Shape : 12

							  					for(int i=1;i<=size;i++){
							  						for(int j=1;j<=size;j++){

							  			                 if((i==1) || (i==size)|| (j==1)|| (j==size) || (j==(size/2)+1)){
							  							System.out.print("*");}

							  							else{System.out.print(" ");}

							  							}

							  							System.out.println();


			}

			System.out.println("\n");
						        // Shape : 13

										  					for(int i=1;i<=size;i++){
										  						for(int j=1;j<=size;j++){

										  			                 if((i==size)|| (j==1)|| (i==j)){
										  							System.out.print(" *");}

										  							else{System.out.print("  ");}

										  							}

										  							System.out.println();


			}



			System.out.println("\n");
									        // Shape : 14

													  					for(int i=1;i<=size;i++){
													  						for(int j=1;j<=size;j++){

													  			                 if((i==1)|| (j==size)|| (i==j)){
													  							System.out.print(" *");}

													  							else{System.out.print("  ");}

													  							}

													  							System.out.println();


			}


System.out.println("\n");

								  					// Shape : 15

								  					for(int i=1;i<=size;i++){
								  						for(int j=1;j<=size;j++){

								  			                 if((j==(size+1)-i) || (i==1) ||(j==1)){
								  							System.out.print(" *");}

								  							else{System.out.print("  ");}

								  							}

								  							System.out.println();


			}

			System.out.println("\n");

											  					// Shape : 16

											  					for(int i=1;i<=size;i++){
											  						for(int j=1;j<=size;j++){

											  			                 if((j==(size+1)-i) || (i==size) ||(j==size)){
											  							System.out.print(" *");}

											  							else{System.out.print("  ");}

											  							}

											  							System.out.println();


			}

			System.out.println("\n");

											// Shape : 17

											for(int i=1;i<=(int)(size/2)+1;i++){
											for(int j=1;j<=size;j++){

											      if(j>=(((int)(size/2)+2)-i) && j<=((int)(size/2)+i)){
														System.out.print("*");}

													else{System.out.print(" ");}

											}System.out.println();}

											for(int i=((int)(size/2)+1)-1;i>=1;i--){
												for(int j=1;j<=size;j++){

												      if(j>=(((int)(size/2)+2)-i) && j<=((int)(size/2)+i)){
																System.out.print("*");}

												else{System.out.print(" ");}

											}System.out.println();}

		System.out.println("\n");

													// Shape : 18

													for(int i=1;i<=(int)(size/2)+1;i++){
													for(int j=1;j<=size;j++){

													      if(j>=(((int)(size/2)+2)-i) && j<=((int)(size/2)+i)){
																System.out.print("*");}

															else{System.out.print("+");}

													}System.out.println();}

													for(int i=((int)(size/2)+1)-1;i>=1;i--){
														for(int j=1;j<=size;j++){

														      if(j>=(((int)(size/2)+2)-i) && j<=((int)(size/2)+i)){
																		System.out.print("*");}

														else{System.out.print("+");}

													}System.out.println();}





		}

	}
