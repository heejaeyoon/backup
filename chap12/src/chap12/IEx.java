package chap12;

public class IEx {
	public static void main(String[] args) {
//		I.d();
		I i = new I() {
			public void d() {
				System.out.println("dd");
			}
		};
		i.d();
		Ison is = new Ison();
		is.d();
	}
}
