package java8.streams;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	EmployeeRepository repo=new EmployeeRepository();
	//Fetch all the female employees
	public List<Employee> fetchFemaleEmployees(){
		
		List<Employee> femaleEmployee = repo.allEmployees()
				.stream()
				.filter(e->e.getGender().equalsIgnoreCase("female"))
				.toList();
		return femaleEmployee;
 		
	}
	//Add 10% hike to all the employees;
	public List<Employee> hikedEmp(){
		List<Employee> hikedEmp=repo.allEmployees()
				.stream()
				.filter(e->e.getGender().equalsIgnoreCase("male"))
				.map(e->{ e.setSalary(e.getSalary()*1.1);
				return e;
				})
				.collect(Collectors.toList());
				
		return hikedEmp;
	}
	
	//count the female employees in the list
	public long femaleCount() {
		List<Employee> all=repo.allEmployees();
		long count=all.stream().filter(e->e.getGender().equalsIgnoreCase("female")).count();
		
		return count;
	}
	
	//Highest Paid Employee
	public Employee highestPaidEmp() {
		List<Employee> all=repo.allEmployees();
		Employee emp=all.stream()
				.max((e1,e2)->
				{if(e1.getSalary()>e2.getSalary())
					return 1;
				else if(e1.getSalary()<e2.getSalary())
					return -1;
				else
					return 0;	
				}).get();
		return emp;
	}
	
	//Top 3 paid Employees
	public List<Employee> top3Paid() {
		List<Employee> all=repo.allEmployees();
		List<Employee> top3=all.stream()
								.sorted((e1,e2)->
								{if(e1.getSalary()<e2.getSalary())
									return 1;
								else if(e1.getSalary()>e2.getSalary())
									return -1;
								else
									return 0;	
								}).limit(3)
								.collect(Collectors.toList());
		return top3;
	}
	
}
