package com.ag.rent.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bookings")

public class Booking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private long id;
	@Column(name="ziua")
	private String ziua;
	@Column(name="ora")
	private String ora;
	@Column(name="customerName")
	private String customerName;
	@Column(name="teren")
	private int teren;
	@Column(name="pret")
	private int pret;
	@Column(name="sport")
	private String sport;
	
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
	
	public String getSport() {
		return this.sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}

	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", ziua=" + ziua + ", ora=" + ora + ", customerName=" + customerName + ", teren="
				+ teren + ", pret=" + pret + ", sport=" + sport + "]";
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
