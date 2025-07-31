package collections.hashmap;


public class Student {
	private int id;
	public Student(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	@Override
//	public int hashCode() {
//		return id;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		if(id==s.id) {
			return true;
		}
		return false;
	}

	
}
