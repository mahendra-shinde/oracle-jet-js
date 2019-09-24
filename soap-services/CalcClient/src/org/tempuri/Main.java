package org.tempuri;

public class Main {

	public static void main(String[] args) {
		// Service Locator [takes care of transportation]
		Calculator calcClient = new Calculator();
		// Service Endpoint (SOAP) [Proxy object]
		CalculatorSoap service = calcClient.getCalculatorSoap();
		
		int x = service.add(122, 22);
		
		System.out.println("Answer "+x);
		
	}

}
