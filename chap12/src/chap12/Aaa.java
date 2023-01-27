package chap12;
abstract class Bbb {
	abstract void print();
}
abstract class Ccc extends Bbb{
	abstract void printC();
}
class Ddd extends Ccc{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printC() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Aaa {
	public static void main(String[] args) {
//		Bbb bb = new Bbb();
//		Ccc cc = new Ccc();
		
	}
}
