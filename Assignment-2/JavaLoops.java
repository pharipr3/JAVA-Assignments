import java.text.*;
import java.util.Scanner;
public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter Number");
		 Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			for (int i = 1; i <= t; i++) { 
				  
	            // loop to print the number of spaces before the star 
	            for (int j = t; j >= i; j--) { 
	                System.out.print(" "); 
	            } 
	  
	            // loop to print the number of stars in each row 
	            for (int j = 1; j <= i; j++) { 
	                System.out.print("* "); 
	            } 
	  
	            // for new line after printing each row 
	            System.out.println(); 
			}
			int j = 0;
			do {
				 for (int k = t; k >= j; k--) { 
		                System.out.print(" "); 
		            } 
		  
		            // loop to print the number of stars in each row 
		            for (int k = 1; k <= j; k++) { 
		                System.out.print("* "); 
		            } 
		  
		            // for new line after printing each row 
		            System.out.println(); 
			  j++;
			}
			while (j < t);
	}
}


