package com.bank;

public class Customer {
	 private long custId;
	    private String cName;
	    private Account account;
	    private Loan loan;
	    //private Transaction transaction;
	    private Address address;
		public long getCustId() {
			return custId;
		}
		public void setCustId(long custId) {
			this.custId = custId;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public Account getAccount() {
			return account;
		}
		public void setAccount(Account account) {
			this.account = account;
		}
		public Loan getLoan() {
			return loan;
		}
		public void setLoan(Loan loan) {
			this.loan = loan;
		}
//		public Transaction getTransaction() {
//			return transaction;
//		}
//		public void setTransaction(Transaction transaction) {
//			this.transaction = transaction;
//		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public Customer(long custId, String cName, Account account, Loan loan, 
				Address address) {
			super();
			this.custId = custId;
			this.cName = cName;
			this.account = account;
			this.loan = loan;
//			this.transaction = transaction;
			this.address = address;
		}
		public Customer() {
			super();
		}
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", cName=" + cName + ", account=" + account + ", loan=" + loan
					+  ", address=" + address + "]";
		}

	 

	    
	 
	}
	 


