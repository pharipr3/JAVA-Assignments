import java.text.*;
import java.util.Scanner;
public class Palindrome {	

	public static void main(String[] args) {
		String original, reverse = ""; 
	      Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	     
	      int length = original.length();
	     
	      for (int inti = length - 1; inti >= 0; inti--)
	         reverse = reverse + original.charAt(inti);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	}

}
