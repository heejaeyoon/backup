package chap06;

public class Student {
		String name;
		String hakbun;
		String address;
		int kor;
		int math;
		int eng;
		
		Student(){}
		
		Student(String name, String hakbun, String address) {
			this.name = name;
			this.hakbun = hakbun;
			this.address = address;
			}

		Student(String name, String hakbun, String address, int kor, int math, int eng) {
			this.name = name;
			this.hakbun = hakbun;
			this.address = address;
			this.kor = kor;
			this.math = math;
			this.eng = eng;
		}
		int sum(){
			return this.kor+this.eng+this.math;
		}
		double avg() {
			return sum() / 3.0; 
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", hakbun=" + hakbun + ", address=" + address + ", kor=" + kor + ", math="
					+ math + ", eng=" + eng + "]";
		}
		
			
		
	}


