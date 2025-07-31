package java8.methodreference;

import java.util.List;

import java8.streams.Employee;
import java8.streams.EmployeeRepository;

public class MethodReferenceOnParameter {

	public static void main(String[] args) {
		EmployeeRepository repo=new EmployeeRepository();
		List<Employee> emplist=repo.allEmployees();
		
		//Get all the names of employees
		List<String> enames=emplist.stream()
								.map(Employee::getName)
								.toList();
		enames.forEach(System.out::println);
	}

}
