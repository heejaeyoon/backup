package jdbc;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpdaoEx {
	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		ed.realSelectAll();
		List<Emp> lst = ed.selectAll(0);
//		lst.stream().forEach(n->System.out.println(n));
		Map<Integer, List<Emp>> md1 = lst.stream().collect(Collectors.groupingBy(Emp::getDeptno));
		md1.get(30).stream().forEach(n -> System.out.println(n));
		// ------------------------
		Map<Integer, Double> md2 = lst.stream()
				.collect(Collectors.groupingBy(Emp::getDeptno, Collectors.averagingDouble(Emp::getSal)));
		System.out.println(md2.get(20));
		// ------------------------
		Map<Integer, String> md3 = lst.stream().collect(
				Collectors.groupingBy(Emp::getDeptno,Collectors.mapping(Emp::getEname,Collectors.joining(","))));
		System.out.println(md3.get(20));

	}
}
