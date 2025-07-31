package java8.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	public List<Employee> allEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(101,"Kittu","female",50000));
		employees.add(new Employee(102,"Billu","male",25000));
		employees.add(new Employee(103,"Roman","male",45000));
		employees.add(new Employee(104,"Nirmala","female",85000));
		employees.add(new Employee(105,"Virat","male",200000));
		employees.add(new Employee(106,"Neymar","male",500000));
		employees.add(new Employee(107,"Lee","male",65000));
		employees.add(new Employee(108,"Srikanth","male",50000));
		employees.add(new Employee(109,"Padmini","female",12000));
		employees.add(new Employee(110,"Pendu","female",25000));
		employees.add(new Employee(111,"Akash","male",20000));
		
		
		return employees;
	}
}
