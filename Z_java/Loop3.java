package Z_java;

import java.util.Scanner;

public class Loop3 {
	
		static Scanner mScanner = new Scanner(System.in);
		 
		public static void main(String[] args) {
			 int UserInput = 0;
			try {
				
				pr("Please give a number :");
				UserInput = mScanner.nextInt();
				while (UserInput < 50) {
					prln(100/UserInput);
					UserInput++;
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				UserInput++;
				prln("came out of try-catch block,with UserInput :"+UserInput);
			}
			prln("thak you for seen my program");
		}
		static void prln(Object anyObject)
		{
			System.out.println(anyObject);
		}
		
		static void pr(Object anyObject)
		{
			System.out.print(anyObject);
		}



	}




