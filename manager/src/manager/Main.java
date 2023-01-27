package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

public class Main {
	public static void main(String[] args) {
		Map<Integer, MemberVo> db = new HashMap<>();
		
		//C(insert)
		MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1");
		vo1.setRegdate(new Data() {
		});
		MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
		vo2.setRegdate(new Data() {
		});
		MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
		vo3.setRegdate(new Data() {
		});
		
		
		db.put(1, vo1);
		db.put(2, vo2);
		db.put(3, vo3);
		System.out.println("저장 온료!");
		
		//R
		List<MemberVo> ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 조회 완료!");
		
		MemberVo vo = null;
		vo = db.get(1);
		System.out.println(vo);
		
		vo = db.get(4);
		System.out.println(vo);
		System.out.println("조회 완료!");
		
		//U
		vo = db.get(1);
		System.out.println(vo);
		
		if(vo != null) {
			vo.setMemberPw("4321");
			vo.setNickName("1nick");
			db.put(vo.getNum(), vo);
		}
		vo = db.get(1);
		System.out.println(vo);
		System.out.println("수정 완료!");
		
		//D
		db.remove(2);
		ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 조회 완료!");
		
		db.clear();
		
		ls = new ArrayList<>(db.values());
		for(MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 조회 완료!");
		
	}
}

