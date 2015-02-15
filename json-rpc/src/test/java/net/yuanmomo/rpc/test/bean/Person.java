package net.yuanmomo.rpc.test.bean;

import java.util.Date;
import java.util.List;

public class Person {

	private int[] floors;
	private String name;
	private int age;
	private String level;
	private boolean male;
	private Date birth;
	private short sh;
	public short getSh() {
		return sh;
	}

	public void setSh(short sh) {
		this.sh = sh;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	private Person partner;
	private List<?> mates;

	public List<?> getMates() {
		return mates;
	}

	public void setMates(List<?> mates) {
		this.mates = mates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public Person getPartner() {
		return partner;
	}

	public void setPartner(Person partner) {
		this.partner = partner;
	}

	public int[] getFloors() {
		return floors;
	}

	public void setFloors(int[] floors) {
		this.floors = floors;
	}

}
