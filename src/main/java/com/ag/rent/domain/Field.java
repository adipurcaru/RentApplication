package com.ag.rent.domain;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Field")
public class Field {

	@Id
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String nume;
	@Column(name="adresa")
	private String adresa;
	@Column(name="descriere")
	private String descriere;
	@ManyToOne
	@JoinColumn(name="sport_id")
	private	Sport sport;
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	@Column(name="sector")
	private String sector;
	@Column(name="photo1")
	private byte[] photo1;
	@Column(name="photo2")
	private byte[] photo2;
	@Column(name="photo3")
	private byte[] photo3;
	@Column(name="photo4")
	private byte[] photo4;
	@Column(name="photo5")
	private byte[] photo5;
	@Column(name="price_per_hr")
	private int price_per_hr;
	@Column(name="created_dt")
	private Date created_dt;
	@Column(name="created_by")
	private String created_by;
	@Column(name="updated_dt")
	private Date updated_dt;
	@Column(name="updated_by")
	private Date updated_by;
	
	public Field() {}
	
	public Field(long id, String nume, String adresa, String descriere, Sport sport, long city_id, String sector,
			byte[] photo1, byte[] photo2, byte[] photo3, byte[] photo4, byte[] photo5, int price_per_hr,
			Date created_dt, String created_by, Date updated_dt, Date updated_by) {
		super();
		this.id = id;
		this.nume = nume;
		this.adresa = adresa;
		this.descriere = descriere;
		this.sport = sport;
		this.city = city;
		this.sector = sector;
		this.photo1 = photo1;
		this.photo2 = photo2;
		this.photo3 = photo3;
		this.photo4 = photo4;
		this.photo5 = photo5;
		this.price_per_hr = price_per_hr;
		this.created_dt = created_dt;
		this.created_by = created_by;
		this.updated_dt = updated_dt;
		this.updated_by = updated_by;
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
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public City getCity_id() {
		return city;
	}
	public void setCity_id(City city) {
		this.city = city;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public byte[] getPhoto1() {
		return photo1;
	}
	public void setPhoto1(byte[] photo1) {
		this.photo1 = photo1;
	}
	public byte[] getPhoto2() {
		return photo2;
	}
	public void setPhoto2(byte[] photo2) {
		this.photo2 = photo2;
	}
	public byte[] getPhoto3() {
		return photo3;
	}
	public void setPhoto3(byte[] photo3) {
		this.photo3 = photo3;
	}
	public byte[] getPhoto4() {
		return photo4;
	}
	public void setPhoto4(byte[] photo4) {
		this.photo4 = photo4;
	}
	public byte[] getPhoto5() {
		return photo5;
	}
	public void setPhoto5(byte[] photo5) {
		this.photo5 = photo5;
	}
	public int getPrice_per_hr() {
		return price_per_hr;
	}
	public void setPrice_per_hr(int price_per_hr) {
		this.price_per_hr = price_per_hr;
	}
	public Date getCreated_dt() {
		return created_dt;
	}
	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated_dt() {
		return updated_dt;
	}
	public void setUpdated_dt(Date updated_dt) {
		this.updated_dt = updated_dt;
	}
	public Date getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(Date updated_by) {
		this.updated_by = updated_by;
	}

	@Override
	public String toString() {
		return "Field [id=" + id + ", nume=" + nume + ", adresa=" + adresa + ", descriere=" + descriere + ", sport="
				+ sport + ", city=" + city + ", sector=" + sector + ", photo1=" + Arrays.toString(photo1) + ", photo2="
				+ Arrays.toString(photo2) + ", photo3=" + Arrays.toString(photo3) + ", photo4="
				+ Arrays.toString(photo4) + ", photo5=" + Arrays.toString(photo5) + ", price_per_hr=" + price_per_hr
				+ ", created_dt=" + created_dt + ", created_by=" + created_by + ", updated_dt=" + updated_dt
				+ ", updated_by=" + updated_by + "]";
	}




	
	
}
	
	