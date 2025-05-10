package com.StandaloneCollection;

import java.util.List;
import java.util.Set;

public class Books {
	List<String> Bname;
	Set<Double> Bprice;
	public List<String> getBname() {
		return Bname;
	}
	public void setBname(List<String> bname) {
		Bname = bname;
	}
	public Set<Double> getBprice() {
		return Bprice;
	}
	public void setBprice(Set<Double> bprice) {
		Bprice = bprice;
	}
	public Books(List<String> bname, Set<Double> bprice) {
		super();
		Bname = bname;
		Bprice = bprice;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Books [Bname=" + Bname + ", Bprice=" + Bprice + "]";
	}
	
}
