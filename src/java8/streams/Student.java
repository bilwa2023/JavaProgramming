package java8.streams;

public class Student {
	int id;
	String name;
	double marks;

	public Student(int id,String name,double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString(){
		return "Student [ id :"+id+" Name: "+name+" marks: "+marks+ "]";
	}

}
