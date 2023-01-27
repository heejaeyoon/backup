package chap09;
class Com extends Cal{
	
	int x = 200;
	
	
	
	@Override
	public String toString() {
		return "Com [x=" + x + "]";
	}



	@Override
	void size() {
		super.size();
		System.out.println("Com");
		
	}
	
} 
public class Cal {
		void size() {
		System.out.println("Cal");
	}
}
