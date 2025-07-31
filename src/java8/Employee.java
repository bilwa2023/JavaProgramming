package java8;

public class Employee {
	int empid;
	String name;
	double salary;
	String contact;
	
	public Employee(int empid,String name,double salary,String contact) {
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.contact=contact;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", contact=" + contact + "]";
	}
	
}
