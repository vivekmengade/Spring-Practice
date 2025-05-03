package com.DependencyInjection;

public class Student {
	
	String name;
	int id;
	Address add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Student(String name, int id, Address add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" +add+ "]";
	}
	
	
}
