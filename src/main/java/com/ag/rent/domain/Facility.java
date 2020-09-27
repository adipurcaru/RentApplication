package com.ag.rent.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Facility")
public class Facility {

	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "created_date")
	private Date created_date;
	@Column(name = "created_by")
	private String created_by;
	
	public Facility() {}
	
	public Facility(long id, String name, Date created_date, String created_by) {
		super();
		this.id = id;
		this.name = name;
		this.created_date = created_date;
		this.created_by = created_by;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	@Override
	public String toString() {
		return "Facility [id=" + id + ", name=" + name + ", created_date=" + created_date + ", created_by=" + created_by
				+ "]";
	}
	
	
}
