package com.bank;

public class Loan {
	 private long loanId;
	    private String loanName;
		public long getLoanId() {
			return loanId;
		}
		public void setLoanId(long loanId) {
			this.loanId = loanId;
		}
		public String getLoanName() {
			return loanName;
		}
		public void setLoanName(String loanName) {
			this.loanName = loanName;
		}
		@Override
		public String toString() {
			return "Loan [loanId=" + loanId + ", loanName=" + loanName + "]";
		}
		public Loan() {
			super();
		}
		public Loan(long loanId, String loanName) {
			super();
			this.loanId = loanId;
			this.loanName = loanName;
		}

	}


