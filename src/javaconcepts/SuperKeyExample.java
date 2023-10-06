package javaconcepts;

public class SuperKeyExample {
		public static void a1() {
			System.out.println("a1 method parent");
		}
		public void a2() {
			System.out.println("a2 method parent");
		}
	public static void main(String[] args) {
		SuperKeyExample s=new SuperKeyExample();
		s.a1();
		s.a2();
	}

}