package Z_java;

import java.util.Scanner;

public class Bookstor {

	static Scanner myScanner = new Scanner(System.in);
	
	static String[] books = {"java","pythona","c++"};
	
	static final double strudentdiscount = 0.5;
	static final double teacherdiscount = 0.3;
	static final double aliendiscount = 0.1;

	public static void main(String[] args) {
		
		prln("......WELCOME TO OUR BOOKSTORE.......");
		prln("Which book you want??\nAnswer:");
		String userchoice = myScanner.nextLine();
		
		if(books[0].toLowerCase().equals(userchoice.toLowerCase())) {
			prln("You opted for " +books[0]+ " Book.");
			claculatePrice(books[0]);
		}
		else if (books[1].toLowerCase().equals(userchoice.toLowerCase())) {
			prln("You opted for " +books[1]+ " Book.");
			claculatePrice(books[1]);
		}
		else if (books[2].toLowerCase().equals(userchoice.toLowerCase())) {
			prln("You opted for " +books[2]+ " Book.");
			claculatePrice(books[2]);
		} else {
			prln("Sorry!! we don't have that book.");
		}
		
	}
	
	static void claculatePrice(String bookname) {
		prln("Are you student,Teacher,alien??\nANS:");
		String answer = myScanner.nextLine();
		
		 double price = 200;
		
		if(answer.toLowerCase().equals("student"))
		{
			price = price-(price*strudentdiscount);
			Showprice(price);
		}
		else if (answer.toLowerCase().equals("teacher")) 
		{
			price = price-(price*teacherdiscount);
			Showprice(price);
		}
		else if (answer.toLowerCase().equals("alien")) 
		{
			price = price-(price*aliendiscount);
			Showprice(price);
		}
		else
		{
			prln("Sorry!! We can't sarve you");
		}
		}
	static void Showprice(double price)
	{
		prln("Your total amount :" +price);
		prln("......Thank you for shopping our bookstore....");
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



