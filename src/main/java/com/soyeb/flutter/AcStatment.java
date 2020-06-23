package com.soyeb.flutter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AcStatment {
	
	@Id
	@GeneratedValue
	private int id;
	private String srlNo;
	private String name;
	private String date;
	private float balance;
	private float debit;
	private float credit;
	private String remarks;
	

	public AcStatment() {}
	
	public AcStatment(int id, String srlNo, String name, String date, float balance, float debit, float credit,
			String remarks) {
		super();
		this.id = id;
		this.srlNo = srlNo;
		this.name = name;
		this.date = date;
		this.balance = balance;
		this.debit = debit;
		this.credit = credit;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSrlNo() {
		return srlNo;
	}

	public void setSrlNo(String srlNo) {
		this.srlNo = srlNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getDebit() {
		return debit;
	}

	public void setDebit(float debit) {
		this.debit = debit;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "AcStatment [id=" + id + ", srlNo=" + srlNo + ", name=" + name + ", date=" + date + ", balance="
				+ balance + ", debit=" + debit + ", credit=" + credit + ", remarks=" + remarks + "]";
	}
	
	
	
	

}

