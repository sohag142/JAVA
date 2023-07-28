package Z_java;

import java.util.Scanner;
public class Boolean {
	
	
		
		static Scanner mysccScanner = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int firstnuber;
			int secondnumber;
			 int ca;
			
			char[] cards = {'A','B','D','F'};
			firstnuber = 10;
			secondnumber = 20;
			System.out.print(" Please give the number : ");
	        firstnuber = mysccScanner.nextInt();
			secondnumber = mysccScanner.nextInt();
			System.out.print(" Enter the card number : ");
			 ca = mysccScanner.nextInt();
			
			boolean statement = function(firstnuber,secondnumber);
			
			System.out.print(" The first number : " );
			System.out.println(firstnuber);
			System.out.print(" The second number : ");
			System.out.println(secondnumber);
			System.out.print(" The card : ");
			System.out.println(cards[ca]);
			System.out.print(" Compare Result : ");
			System.out.println(statement);
			
			
		}
		static public boolean function(int firstvalue,int secondvalue)
		{
			boolean answer = firstvalue > secondvalue;
			return answer;
		}
	}



