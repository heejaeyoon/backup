package 람다식;

public class MyInterfEx {
	public static void main(String[] args) {
	      //원래 하는 방식
	      MyInterf f12 = new MyInterf(){
	         
	         @Override
	         public void method(String str) {
	            System.out.println(str);
	         }
	         
	      };
	      f12.method("test");
	      //
	      
	      
	      MyInterf fi;
	      fi = (str) -> {
	         System.out.println(str);
	      };
	      fi.method("test2");
	   }

}
