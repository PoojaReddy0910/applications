package com.bank;

public class Account {
	private long accNo;
    private String accType;
    public Account() {
        super();
    }
    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", accType=" + accType + "]";
    }
    

 

}
 

