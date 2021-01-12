package com.baeldung.spring.kafka;

public class Greeting {

	private String msg;
    private String name;
    
	public Greeting() {
		
		
	}
	public Greeting(String msg, String name) {
		super();
		this.msg = msg;
		this.name = name;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
    
}
