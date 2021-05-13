package com.beans;

import java.util.List;

public class Account {
	List account_holder;

	@Override
	public String toString() {
		return "Account [account_holder=" + account_holder + "]";
	}

	public Account() {
		super();
	}

	public Account(List account_holder) {
		super();
		this.account_holder = account_holder;
	}

	public List getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(List account_holder) {
		this.account_holder = account_holder;
	}

}
