package com.aditya.demo.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserRequest {

    public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public UserRequest(String alias, String name) {
		super();
		this.alias = alias;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String alias;
    private String name;
}
