import java.util.Scanner;
public class OddOrEven {
	public static void main(String[] args) {
	 Scanner reader=new Scanner(System.in);
	 System.out.print("Enter a Number ");
	 int num=reader.nextInt();
	 
		 if(num%2==0)
		 {
			 System.out.print(num +" is Even ");
		 }
		 else
		 {
			 System.out.print(num +" is Odd "); 
		 }
	}
}
