package 람다식;

public class MyInterfaceEx {

	public static void main(String[] args) {
	      MyInterface683 mi = (s) -> {
	         return (s.equals("OK")) ? 100 : 0;
//	         if (s.equals("OK")) {
//	            return 100;
//	         } else {
//	            return 0;
//	         }
	      };
	      int num = mi.method("OK");
	      int num2 = mi.method("11");
	      System.out.println(num);
	}

}
