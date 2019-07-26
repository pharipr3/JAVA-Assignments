

import java.util.Scanner;

 public class Calculator
	{		
		public void add(int num1,int num2)
		{			
			 System.out.println("Sum of the numbers is:" +(num1+num2));
		}
	

		public void add(int num1,int num2,int num3)
		{			
			System.out.println("Sum of the numbers is:" +(num1+num2+num3));
		}

		public void subtract(int num1,int num2)
		{
			System.out.println("Difference of the numbers is:" +(num1-num2));
		}

		public void subtract(int num1,int num2,int num3)
		{
			
			System.out.println("Difference of the numbers is:" +(num1-num2-num3));
		}
	
		public void multiply(int num1,int num2)
		{
		 
		System.out.println("Multiplied number is:" +(num1*num2));
		}

		public void divide(double num1,double num2)
		{		 
			try
			{
				System.out.println(" Division of the number is:" +(num1/num2));
			}
			catch(Exception ex)
			{
				System.out.println(" Division Numbers are out of Range");
			}
			
		}
		
		
		public static void main(String[] args) {
		{

		int choose;
		int intN1,intN2,intN3;
		double M1,M2;
		Calculator calc=new Calculator();

	    	System.out.println("Please choose one of the below calculator operations:");
	    	System.out.println("1.Addition of 2 nos.");
		    System.out.println("2.Addition of 3 nos.");
	        System.out.println("3.Subtration of 2 nos.");
	        System.out.println("4.Subtraction of 3 nos.");
	        System.out.println("5.Multiplication of 2 nos.");
	        System.out.println("6.Division of 2 nos.");
	        
	        Scanner number = new Scanner(System.in);

	        choose=number.nextInt();

	    	switch (choose){
	                                    case 1: 
	                                    
	                                    	System.out.println("Please enter Number 1 : ");
											intN1=number.nextInt();
											System.out.println("Please enter Number 2 : ");
											intN2=number.nextInt();
											calc.add(intN1,intN2);
	                                    
	                                    break;

	                                    
	                                    case 2:
	                                   
											System.out.println("Please enter Number 1 : ");
											intN1=number.nextInt();
											System.out.println("Please enter Number 2 : ");
											intN2=number.nextInt();
											System.out.println("Please enter Number 3 : ");
											intN3=number.nextInt();
											calc.add(intN1,intN2,intN3); 
	                                    
	                                    break;
	                                    case 3: 
	                                    
	                                    	System.out.println("Please enter Number 1 : ");
	                                    	intN1=number.nextInt();
	                                    	System.out.println("Please enter Number 2 : ");
	                                    	intN2=number.nextInt();
	                                    	calc.subtract(intN1,intN2);
	                                    
	                                    break;
	                                    
	                                    case 4: 
	                                    
	                                    	System.out.println("Please enter Number 1 : ");
	                                    	intN1=number.nextInt();
	                                    	System.out.println("Please enter Number 2 : ");
	                                    	intN2=number.nextInt();
	                                    	System.out.println("Please enter Number 3 : ");
	                                    	intN3=number.nextInt();
	                                    	calc.subtract(intN1,intN2,intN3); 
	                                    
	                                    break;

	                                    case 5: 
	                                    
	                                    	System.out.println("Please enter Number 1 : ");
	                                    	intN1=number.nextInt();
	                                    	System.out.println("Please enter Number 2 : ");
	                                    	intN2=number.nextInt();
	                                    	calc.multiply(intN1,intN2);
	                                   
	                                    break;

									    case 6: 
									    
					                         System.out.println("Please enter Number 1 : ");
					                         M1=number.nextDouble();           	
					                         System.out.println("Please enter Number 2 : ");				
					                         M2=number.nextDouble();				
					                         calc.divide(M1,M2);				
									    
	                                    break;
	                    }
	    	
	  		}	
	}
	}











