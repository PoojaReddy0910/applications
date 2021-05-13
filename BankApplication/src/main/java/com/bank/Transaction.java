package com.bank;

public class Transaction {
	
	    private String transactionId;
	    private String type;
		public String getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(String transactionId) {
			this.transactionId = transactionId;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Transaction(String transactionId, String type) {
			super();
			this.transactionId = transactionId;
			this.type = type;
		}
		public Transaction() {
			super();
		}
		@Override
		public String toString() {
			return "Transaction [transactionId=" + transactionId + ", type=" + type + "]";
		}
	    
	
	}


