package com.ag.rent.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="terenuri")
public class Teren {

	@Id
	@Column(name="id")
	private long id;
	@Column(name="nume")
	private String nume;
	@Column(name="adresa")
	private String adresa;
	@Column(name="pret")
	private int pret;
	@Column(name="sport")
	private	String sport;
	@Column(name="oras")
	private String oras;
	
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
	}
	@Override
	public String toString() {
		return "TerenEntity [id=" + id + ", nume=" + nume + ", adresa=" + adresa + ", pret=" + pret + "]";
	}
	
	
}
