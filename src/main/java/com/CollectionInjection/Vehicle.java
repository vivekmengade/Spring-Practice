package com.CollectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vehicle {
	List<String> cname;
	Set<Double> price;
	Map<String, String> data;
	public List<String> getCname() {
		return cname;
	}
	public void setCname(List<String> cname) {
		this.cname = cname;
	}
	public Set<Double> getPrice() {
		return price;
	}
	public void setPrice(Set<Double> price) {
		this.price = price;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	public Vehicle(List<String> cname, Set<Double> price, Map<String, String> data) {
		super();
		this.cname = cname;
		this.price = price;
		this.data = data;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [cname=" + cname + ", price=" + price + ", data=" + data + "]";
	}
	
	
}
