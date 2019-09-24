package com.mahendra.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hello")
public class HelloResource {

	@GET @Produces("text/plain")
	public String sayHello() {
		System.out.println("Invoking Plain text");
		return "Hello World";
	}
	
	@GET @Produces("text/html")
	public String sayHello2() {
		System.out.println("Invoking HTML");
		return "<h2>Hello World</h2>";
	}
}
