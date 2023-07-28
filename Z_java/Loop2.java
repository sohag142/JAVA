package Z_java;

import java.util.Scanner;


public class Loop2 {
	
		static Scanner mScanner = new Scanner(System.in);
		public static void main (String[] args) {
			
			int [][] twoDarr = new int[3][3];
			
			prln("plese give your input:");
			
			for(int row = 0; row<3;row++)
			{
				for(int clm = 0;clm<3;clm++)
				{
					pr("twoDarr["+row+"]["+clm+"] :");
					twoDarr[row][clm] = mScanner.nextInt();
				}
			}
			
			try {
				for(int row = 0; row<3;row++)
				{
					for(int clm = 0;clm<3;clm++)
					{
						pr(twoDarr[row][clm]+"\t");
					}
					pr("\n");
				}
			} catch (Exception sohag) {
				sohag.printStackTrace();
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



