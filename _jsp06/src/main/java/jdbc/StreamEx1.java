package jdbc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import javax.sound.midi.Soundbank;

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
		
		
	}
}
