package model.review;

import java.sql.Date;

public class ReviewVO {	
	private int onum; // FK
	private int rnum; // PK 
	private String writer; // 작성자
	private	String title; // 제목
	private String content; // 내용
	private Date wdate; // 작성날짜 (Date 자료형 활용)
	
    // [getter, setter]
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

    // toString 오버라이딩 - 로깅기법용
	@Override
	public String toString() {
		return "ReviewVO [onum=" + onum + ", rnum=" + rnum + ", writer=" + writer + ", title=" + title + ", content="
				+ content + ", wdate=" + wdate + "]";
	}	
}
