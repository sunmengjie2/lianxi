package com.sunmengjie.entity;

import java.util.Date;

public class Meng {
	private String name;
	
	private String direct;
	
	private String timea;
	
	private Date d1;
	private Date d2;
	
	private Integer p1;
	private Integer p2;
	private Integer s1;
	private Integer s2;
	
	public Meng() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meng(String name, String direct, String timea, Date d1, Date d2, Integer p1, Integer p2, Integer s1,
			Integer s2) {
		super();
		this.name = name;
		this.direct = direct;
		this.timea = timea;
		this.d1 = d1;
		this.d2 = d2;
		this.p1 = p1;
		this.p2 = p2;
		this.s1 = s1;
		this.s2 = s2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	public String getTimea() {
		return timea;
	}

	public void setTimea(String timea) {
		this.timea = timea;
	}

	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}

	public Date getD2() {
		return d2;
	}

	public void setD2(Date d2) {
		this.d2 = d2;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}

	public Integer getS1() {
		return s1;
	}

	public void setS1(Integer s1) {
		this.s1 = s1;
	}

	public Integer getS2() {
		return s2;
	}

	public void setS2(Integer s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return "Meng [name=" + name + ", direct=" + direct + ", timea=" + timea + ", d1=" + d1 + ", d2=" + d2 + ", p1="
				+ p1 + ", p2=" + p2 + ", s1=" + s1 + ", s2=" + s2 + "]";
	}
	
	
}
