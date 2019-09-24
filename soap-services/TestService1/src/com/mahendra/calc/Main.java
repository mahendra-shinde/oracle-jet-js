package com.mahendra.calc;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		System.out.println("Launchinhg a service");
		Endpoint.publish("http://localhost:3000/calc",
				new Calculator());
		Endpoint.publish("http://localhost:3000/acc", new AccountService());
		
	}
}
