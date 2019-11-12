package com.redondo.spring.springcore.prepertyplaceholder.assignement;

public class WSClient {

	public WSClient(String url, String username, String passwrd) {
		this.url = url;
		this.username = username;
		this.passwrd = passwrd;
	}

	private String url;
	private String username;
	private String passwrd;

	@Override
	public String toString() {
		return "WSClient [url=" + url + ", username=" + username + ", passwrd=" + passwrd + "]";
	}

}
