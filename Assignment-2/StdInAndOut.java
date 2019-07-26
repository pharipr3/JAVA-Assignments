import java.text.*;
import java.util.Scanner;
public class StdInAndOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int i    = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();              
        String s = scan.nextLine();
        scan.close();
        
        /* Print output */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
