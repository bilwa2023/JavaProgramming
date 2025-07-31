package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalController {
	
	public static Employee getEmployeeById(int id,List<Employee> list) {
		Optional<Employee> emp=list.stream().filter(e->e.empid==id).findAny();
		return emp.get();
	}
	
	public static void main(String[] args) {

		Employee e1=new Employee(101,"Anas",200000,"6371549886");
		Employee e2=new Employee(102,"Aman",300000,"7371549886");
		Employee e3=new Employee(103,"Arun",400000,"8371549886");
		Employee e4=new Employee(104,"Abhay",500000,"9371549886");
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		Employee e=getEmployeeById(102,emplist);
		System.out.println(e.salary);
	}

}
