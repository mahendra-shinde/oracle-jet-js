package com.mahendra.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.mahendra.models.Customer;

@Path("customer")
public class CustomerResource {

	//Resulting URL for customer id '101'
	// .../customer/101
	@GET @Path("{cust-id}") 
	@Produces({"application/xml","application/json"})
	public Response find(@PathParam("cust-id") int custid) {
		if(custid == 101) {
		Customer cust = new Customer();
		cust.setCustId(custid);
		cust.setEmail("Customer@company.com");
		cust.setName("Happy singh");
		System.out.println("Method invoked");
		return Response.ok(cust).build();}
		else
			return Response.status(404).build();
			
	}
	
	
}
