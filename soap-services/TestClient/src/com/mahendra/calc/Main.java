package com.mahendra.calc;

public class Main {

	public static void main(String[] args) {
		CalculatorService service = new CalculatorService();
		Calculator calc = service.getCalculatorPort();
		int n = calc.add(122, 22);
		System.out.println("Answer "+n);
	}

}
