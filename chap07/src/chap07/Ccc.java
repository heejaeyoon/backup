package chap07;
class Ddd {
	
}
public class Ccc {
	Ddd a;
	int x;
	String s
	Ccc(int x, String s) {
		this.x = x;
		this.s = s;
	}
	Ccc(Ddd d){
		a = d;
	}
//	void mmm(Ddd d) {
//		a = d;
//	}
	
	public static void main(String[] args) {
//		Ddd d = new Ddd();
		Ddd d1 = null;
		Ccc c = new Ccc(new Ddd());
//		c.a = d;
		
		Ccc c1 = new Ccc(10, new String("가나다"));
		Ccc  c = new Ccc(new Ddd());
		c.mmm(new Ddd());
				}
}
