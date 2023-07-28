package Z_java;

public class Loop1 {
	
		public static void main(String[] args) {
			int[]numberArry = new int[100];
			int i= 100;
			while(i>0)
			{
				numberArry[i-1] = i;
				i--;
			}
			
				while(i<100)
				{
					prln("arry["+i+"]:"+numberArry[i]);
					i++;
				}

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



