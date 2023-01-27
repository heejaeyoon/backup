package javaswing2;

class Data3 { int x;}

class Test { 
	
	
	
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		Data3 d2 = copy(d);
		
		System.out.println("d.x = " +d.x);
		System.out.println("d2.x = " +d2.x);
	}
	
	static Data3 copy(Data3 c) {
		Data3 tmp = new Data3();
		tmp.x = c.x; 
		return tmp;
	}
	
	int plus(int x, int y) {
		
		return x+y;
	}
		
}
