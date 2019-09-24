package com.mahendra.calc;

import com.mahendra.Account;
import com.mahendra.AccountService;
import com.mahendra.AccountServiceService;

public class Main {

	public static void main(String[] args) {
//		CalculatorService service = new CalculatorService();
//		Calculator calc = service.getCalculatorPort();
//		int n = calc.add(122, 22);
//		System.out.println("Answer "+n);
		AccountServiceService client = new AccountServiceService();
		AccountService service = client.getAccountServicePort();
		Account acc = service.find(1002);
		System.out.println("Found "+acc.getName());
	}

} 
