package chap06;

import java.util.Iterator;

public class StuArrEx {
	static Student[] stuArr;
	public static void main(String[] args) {
		stuArr = new Student[10];
		
		for(int i = 0; i<stuArr.length; i++) {
			insertStudent(i,"홍"+i,"0"+(i+1),"마포구",89+i,97+i,67+i);
		}
//		for (Student stu : stuArr) {
//			System.out.println(stu);
//		}

		System.out.println(searchStduent("03"));
//		updateKoreScore("03",100);
//		searchStduent("03");
		updateScore("03",50,100,90);
		System.out.println(searchStduent("03"));
		
	}
	static void updateScore(String hakbun, int kor, int math, int eng) {
		Student student = searchStduent(hakbun);
		if(kor >= 0 ) {
			student.math = math;
		}
		if(math >= 0 ) {
			student.kor = kor;
		}
		if(eng >= 0 ) {
			student.eng =eng;
		}
			
		
//		for (int i=0; i<stuArr.length; i++) {
//			if(stuArr[i].hakbun.equals(hakbun)) {
//				stuArr[i].kor = (kor >=0) ? kor : stuArr[i].kor;
//				if (math > 0) {
//					stuArr[i].math = math;
//				}
//				if (eng >= 0) {
//				stuArr[i].eng = eng;
//			}
//				System.out.println(stuArr[i]);
//		}
//	}
}
	
	static void updateKoreScore(String hakbun,int kor) {
		for (int i=0; i<stuArr.length; i++) {
			if(stuArr[i].hakbun.equals(hakbun)) {
				System.out.println(stuArr[i]);
				
			}
		}
	}
	static Student searchStduent(String hakbun) {
		for(int i = 0; i< stuArr.length; i++) {
			if(stuArr[i].hakbun.equals(hakbun)) {
				return stuArr[i];
			}
		}	
		return null;
	}
	static void insertStudent(int i,String name, String hakbun, String addrress,int kor,int math, int eng) {
		stuArr[i]= new Student(name,hakbun,addrress,kor,math,eng);
		}
	
	}
	

