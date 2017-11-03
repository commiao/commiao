package com.commiao.inteface.demo.entities;

import java.io.Serializable;

public class DemoEntity implements Serializable {

	private static final long serialVersionUID = 8482460264659624820L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
