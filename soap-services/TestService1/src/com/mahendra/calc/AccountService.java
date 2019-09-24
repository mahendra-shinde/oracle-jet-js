package com.mahendra.calc;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "mahendra.com")
public class AccountService {
	private AccountManager manager = AccountManager.getInstance();
	
	@WebMethod
	public Account[] getAllAccounts() {
		return manager.getAll();
	}
	
	@WebMethod
	public Account find(Integer accNo) {
		return manager.findByAccNo(accNo);
	}
}
