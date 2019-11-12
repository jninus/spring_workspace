package com.redondo.spring.springcore.prepertyplaceholder;

public class MyDAO {

	MyDAO(String dbServer){
		this.dbServer = dbServer;
	}
	
	private String dbServer;

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}
	
	

}
