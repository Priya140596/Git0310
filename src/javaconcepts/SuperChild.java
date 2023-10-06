package javaconcepts;

public class SuperChild extends SuperKeyExample{

	public void a2() {
		System.out.println("a2 method child");
		super.a1();
	}
	public static void main(String[] args) {
		SuperChild s=new SuperChild();
		s.a1();
		s.a2();
	}

}
