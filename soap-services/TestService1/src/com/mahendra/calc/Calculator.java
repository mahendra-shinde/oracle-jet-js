package com.mahendra.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "test-service",
	targetNamespace = "mahendra.com")
public class Calculator {

	@WebMethod
	public int add(int n1, int n2) {
		System.out.println("Calculating "+n1+" + "+n2 );
		return n1+n2;
	}
}
