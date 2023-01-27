package chap06;

public class StuEx {

	public static void main(String[] args) {
		Student stu;
		stu = new Student();
		stu.name = "홍";
		stu.hakbun = "202202";
		stu.address = "서울 마포구";
		Student stu2 = new Student("홍","2022021","서울 마포구");
//		Student stu3 = new Student("202201","홍","서울 마포구");
		stu2.kor = 90;
		stu2.math = 89;
		stu2.eng = 97;
		
		double dd = stu2.avg();
		System.out.println(dd);
	}

}
