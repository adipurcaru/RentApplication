package com.ag.rent.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	@Column(name="id")
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="created_dt")
	private Date created_dt;
	@Column(name="created_by")
	private String created_by;
	@Column(name="updated_dt")
	private Date updated_dt;
	@Column(name="updated_by")
	private String updated_by;
	
	public City() {}
	
	public City(long id, String name, Date created_dt, String created_by, Date updated_dt, String updated_by) {
		super();
		this.id = id;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", created_dt=" + created_dt + ", created_by=" + created_by
				+ ", updated_dt=" + updated_dt + ", updated_by=" + updated_by + "]";
	}
	
	
}
