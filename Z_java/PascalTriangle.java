package Z_java;

import java.util.Scanner;

public class PascalTriangle {
	
		static Scanner myScanner = new Scanner(System.in);

		public static void main(String[] args) {
			
			prln("Give -1 to exit ?????");
			pr("Give the length of pascal's triangle's length: ");
			int userInput = myScanner.nextInt();
			
			while(userInput != -1)
			{
				if(userInput < -1 || userInput > 20)
				{
					prln("Please enter something between -1~20");
					userInput = myScanner.nextInt();
					continue;
				}
				
				printpascaltriangel(userInput);
				pr("\n");
				pr("Please enter something between -1~20 : ");
				userInput = myScanner.nextInt();
			}
			
			prln("thank you for seen my program!!");
		}
		
		static void printpascaltriangel(int length)
		{
			int[][] pascal = new int[length][length];
		
			for(int i = 0 ; i < length ; i++)
			{
				pascal[0][i] = 1;
				pascal[i][0] = 1;
			}
			
			for(int row = 1 ; row < length ; row++)
			{
				for( int colum = 1 ; colum < length-row ; colum++)
				{
					pascal[row][colum] = pascal[row][colum-1] + pascal[row-1][colum];
				}
			}
			
			for(int row = 0 ; row < length ; row++)
			{
				for( int colum = 0 ; colum < length-row ; colum++)
				{
					pr(pascal[row][colum]+"\t");
					
				}
				prln("\n");
			}
			
			prln("thank you for seen my program!!");
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


