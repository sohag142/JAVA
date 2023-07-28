package Z_java;

public class StringArry {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String myname;
			myname = new String("Sohag Ali , uttara , student at CSE !!");
			
			prln("Previous method : ");
			System.out.println("Previous method : ");
			System.out.println(myname);
			
			prln("\nThis is our new method : ");
			prln(myname);
			
			prln("\nThe number of characters in your name is : "+ myname.length());
			
			// 1 2 3 4 5 6 7 8 9  int[ ] name of array = new int[20]
			
			int[][] twoDarray = new int[2][4];
			
			twoDarray[0][0]=1;
			twoDarray[0][1]=2;
			twoDarray[0][2]=4;
			twoDarray[0][3]=5;
			
			twoDarray[1][0]=2;
			twoDarray[1][1]=4;
			twoDarray[1][2]=5;
			twoDarray[1][3]=9;
			
			twoDarray[1][2] += (twoDarray[0][2]+twoDarray[0][3]);
			
			prln("\n at twoDaray[1][2] is : "+twoDarray[1][2]);
			
			
			// 1 2 4 5
			// 2 4 5 9
			

		}
		static void prln(Object anyObject)
		{
			System.out.println(anyObject);
		}

	}



