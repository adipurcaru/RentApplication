package com.ag.rent.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name="Booking")

public class Booking implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private long id;
	@ManyToOne
	@JoinColumn(name="sport_id")
	private Sport sport;
	@ManyToOne
	@JoinColumn(name="field_id")
	private Field field;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@Column(name="customer_email")
	private String customerEmail;
	@Column(name="booking_date")
	private Date bookingDate;
	@Column(name="start_time")
	private String start_time;
	@Column(name="end_time")
	private String end_time;
	@Column(name="total_price")
	private int pret;
	@Column(name="created_dt")
	private Date created_dt;
	@Column(name="created_by")
	private String created_by;
	@Column(name="updated_dt")
	private Date updated_dt;
	@Column(name="updated_by")
	private String updated_by;
	
	public Booking() {}
	
	public Booking(long id, Field field, Sport sport, User user, String customerEmail, Date bookingDate,
			String start_time, String end_time, int pret, Date created_dt, String created_by, Date updated_dt,
			String updated_by) {
		super();
		this.id = id;
		this.field = field;
		this.sport = sport;
		this.user = user;
		this.customerEmail = customerEmail;
		this.bookingDate = bookingDate;
		this.start_time = start_time;
		this.end_time = end_time;
		this.pret = pret;
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
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public int getPret() {
		return pret;
	}
	public void setPret(int pret) {
		this.pret = pret;
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
		return "Booking [id=" + id + ", field=" + field + ", sport=" + sport + ", user=" + user + ", customerEmail="
				+ customerEmail + ", bookingDate=" + bookingDate + ", start_time=" + start_time + ", end_time="
				+ end_time + ", pret=" + pret + ", created_dt=" + created_dt + ", created_by=" + created_by
				+ ", updated_dt=" + updated_dt + ", updated_by=" + updated_by + "]";
	}

	
}