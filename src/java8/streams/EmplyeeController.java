package java8.streams;

import java.util.List;

public class EmplyeeController {

	public static void main(String[] args) {
		
		//Fetch All the Female Employees 
		EmployeeService service=new EmployeeService();
		List<Employee> femaleEmployees=service.fetchFemaleEmployees();
		
//		System.out.println(femaleEmployees);
		
		
		//Add 10% hike for only male employees
		List<Employee> hikedEmp=service.hikedEmp();
//		hikedEmp.forEach(e->System.out.println(e));
		
		//Count all the female Employees
//		System.out.println(service.femaleCount());
		
		//Fetch highest paid employee
//		System.out.println(service.highestPaidEmp());
		
		//Top 3 paid employees
		List<Employee> top3=service.top3Paid();
		top3.forEach(e->System.out.println(e));
		
		top3.forEach(System.out::println);	
	}

}
