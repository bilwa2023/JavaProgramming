package abstraction;

public class PatternUnlock extends Mobile{
	PatternUnlock(){
		System.out.println("pattern class constructor");
	}
	
	public static void main(String[] args) {
		Mobile p=new PatternUnlock();
		p.unLock();
	}

	@Override
	public void unLock() {
		System.out.println("Mobile unlocked by pattern");
	}

}
