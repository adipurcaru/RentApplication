package com.ag.rent.domain;

import java.util.ArrayList;
import java.util.List;

public class Teren {

	private int id;
	private String nume;
	private String adresa;
	private int pret;
	private	String sport;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
