package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExpression {
	
	
	/*Given :Arraylist object with 1000 employees
	 * Requirement 1-Sort the elements on salary order
	 * Requirement 2-Sort the elements on id's order
	 */
	
	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(101,"Manish",45600,"6987456321"));
		employees.add(new Employee(102,"Mahesh",25600,"9874566332"));
		employees.add(new Employee(103,"Bilwa",30000,"6578944949"));
		employees.add(new Employee(104,"Arbas",35500,"7984562130"));
		
		employees.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1,Employee e2) {
				
				return 1;
			}
		});
		
		Comparator<Employee> emp=(e1,e2)->{
			if(e1.salary<e2.salary)
				return 1;
				else if(e1.salary>e2.salary)
					return -1;
				else
					return 0;
		};
		
		Comparator<Employee> emp1=(e1,e2)->{
			return e1.name.compareTo(e2.name);
		};
		employees.sort(emp1);
		
		System.out.println(employees);
	}
}
