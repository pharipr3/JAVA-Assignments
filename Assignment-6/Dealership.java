package cardealership;

import java.util.ArrayList;

public class Dealership {
	
	public static void main(String[] args) {
		
		
		// Create one manager
		Employee managerInfo = createManager();
		System.out.println("Created Manager and his name is:"+managerInfo.getName());
		 
		System.out.println("-------------------------------");
		System.out.println("Added 5 SalesPerson");
		// Create at least 5 SalesPerson
		ArrayList<Employee> salesPersonsInfo = createSalesPersons();
		for (Employee employee : salesPersonsInfo) {
			System.out.println(employee.getName());
		}
		  
		System.out.println("-------------------------------");
		System.out.println("Added 2 Cars");
		// Create at Least 10 Cars
		ArrayList<Vehicle> carsInfo = createCars();
		    for (Vehicle vehicle : carsInfo) {
		    	System.out.println(vehicle.getMake()+"---"+vehicle.getModel()+"---"+vehicle.getPrice());
			}
		// Create one Dealership and associates manager with it.
		    System.out.println("-------------------------------");
			System.out.println("created Dealer With Manager");
		    createDealerWithManager();
		    Employee dealerWithManagerInfo = createDealerWithManager();
			System.out.println("Dealer Name is:"+dealerWithManagerInfo.getName());
			System.out.println("Dealer Manager Name is:"+dealerWithManagerInfo.getManagerName());
		
		Employee emp1=new Employee();
		emp1.setName("Emp1");
		
		Vehicle v1=new Vehicle();
		v1.setMake("Ford");
		v1.setModel("2019");
		v1.setPrice(10000);
		
		
		Vehicle v2=new Vehicle();
		v2.setMake("Ford");
		v2.setModel("2018");
		v2.setPrice(50000);
		
		Customer c1=new Customer();
		c1.setName("Tom");
		c1.setAddress("Chennai");
		c1.setCashOnHand(100);
		
		boolean finance=true;
		
		
		c1.purchaseVehicle(emp1,v1,finance);
	}

	private static Employee createDealerWithManager() {
		Employee emp1=new Employee();
		emp1.setName("HariPrasad");
		emp1.setManagerName("GV");
		return emp1;
		
	}

	private static ArrayList<Vehicle> createCars() {
		ArrayList<Vehicle> createCars = new ArrayList<Vehicle>();
		Vehicle v1=new Vehicle();
		v1.setMake("Ford");
		v1.setModel("2019");
		v1.setPrice(10000);
		
		
		Vehicle v2=new Vehicle();
		v2.setMake("Ford");
		v2.setModel("2018");
		v2.setPrice(50000);
		createCars.add(v1);
		createCars.add(v2);
		return createCars;
		
	}

	private static ArrayList<Employee> createSalesPersons() {
		ArrayList<Employee> salesPersons = new ArrayList<Employee>();
		Employee emp1=new Employee();
		emp1.setName("SalesPerson1");

        Employee emp2=new Employee();
        emp2.setName("SalesPerson2");
		
		Employee emp3=new Employee();
		emp3.setName("SalesPerson3");
		
		Employee emp4=new Employee();
		emp4.setName("SalesPerson4");
		
		Employee emp5=new Employee();
		emp5.setName("SalesPerson5");
		
		salesPersons.add(emp1);
		salesPersons.add(emp2);
		salesPersons.add(emp3);
		salesPersons.add(emp4);
		salesPersons.add(emp5);
		return salesPersons;

		
	}

	private static Employee createManager() {
		Employee emp1=new Employee();
		emp1.setName("Rahul");
		return emp1;
		
	}
}
