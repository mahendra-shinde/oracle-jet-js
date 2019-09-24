package com.mahendra.calc;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	private static AccountManager manager;
	public static AccountManager getInstance() {
		if(manager == null) {
			manager = new AccountManager();
		}
		return manager;
	}
	
	private List<Account> accounts;
	
	private AccountManager() {
		System.out.println("Building Account manager instance");
		accounts = new ArrayList<Account>();
		accounts.add(new Account(1001, "Rahul",123000D));
		accounts.add(new Account(1002, "Ronit",130000D));
		accounts.add(new Account(1003, "Ritesh",122000D));

		
	}
	
	public Account findByAccNo(int accNo) {
		for(Account a : accounts) {
			if(a.getAccountNo()==accNo) {
				return a;
			}
		}
		return null;
	}
	public Account[] getAll(){
		return accounts.toArray(new Account[accounts.size()]);
	}
}
