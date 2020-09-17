package com.ag.rent.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

public class Booking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "id")
	private long id;
	private String ziua;
	private String ora;
	private String customerName;
	private int teren;
	private int pret;
	private String oras;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getZiua() {
		return ziua;
	}
	public void setZiua(String ziua) {
		this.ziua = ziua;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getTeren() {
		return teren;
	}
	public void setTeren(int teren) {
		this.teren = teren;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}

	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", ziua=" + ziua + ", ora=" + ora + ", customerName=" + customerName + ", teren="
				+ teren + ", pret=" + pret + ", oras=" + oras + "]";
	}
	@Override
	public boolean equals(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
