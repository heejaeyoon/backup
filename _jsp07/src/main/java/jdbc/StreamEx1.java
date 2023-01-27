package jdbc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamEx1 {
	public static void main(String[] args) {
		
		EmpDao ed = EmpDao.getInstance();
		List<Emp> lst = ed.selectAll(0);
//		for (Emp emp : lst) {
//			System.out.println(emp);
//		
//		}
		IntStream.range(1, 5)
		.forEach(n->{
			System.out.println("****");
			System.out.println(n+"test"); 
	});	
		lst.stream().filter(n->n.getEname().startsWith("K")).forEach(n->System.out.println(n));
		System.out.println("------");
		lst.stream().filter(n->n.getSal() >= 2000).forEach(n->System.out.println(n));
		
		System.out.println("--사번으로 정렬--");
		
		lst.stream().sorted().forEach(n->System.out.println(n));
		
		System.out.println("--부서별 정렬--");
	
		lst.stream().sorted((n1, n2)->n1.getDeptno()-n2.getDeptno()).
		forEach(n->System.out.println(n));
		
		System.out.println("--부서별, 사번별 정렬--");
		lst.stream().sorted(Comparator.reverseOrder()).sorted((n1, n2)->n1.getDeptno() - n2.getDeptno())
		.forEach(n-> System.out.println(n.getEmpno()+","+n.getDeptno()));		
		
		//루핑 peek()
		System.out.println("루핑>>>>>>>>");
		List<Emp> dept10 = new ArrayList<>();
		double avg = lst.stream()
					.filter(a-> a.getDeptno()==10)
					.peek(n->dept10.add(n))
					.mapToInt(Emp::getSal)
					.average().getAsDouble();
		dept10.stream().forEach(x->System.out.println(x));
		System.out.println("평균:"+avg);
		
		List<Integer> list = new ArrayList<>();
		
		//방법1 
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균 :" + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 :0.0");
		}
		
		//방법2
		double avg2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("방법2_평균 :" + avg2);
		
		//방법3 
		list.stream().mapToInt(Integer :: intValue).average()
		.ifPresent(a -> System.out.println("방법3_평균 :" + a));

	} //main
	
	
}
