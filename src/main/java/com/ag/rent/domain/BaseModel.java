package com.ag.rent.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.logging.log4j.message.Message;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel<U> implements Serializable {
	/**
	 * Field serialVersionUID, long value to specify a unique version identifier for
	 * BaseObject class
	 */
	private static final long serialVersionUID = 5316908169423027141L;

	/**
	 * AGC-standard auditing column createdBy which allows for automatic DML
	 * auditing
	 */
	@Column(name = "CREAT_BY")
	@CreatedBy
	protected U createdBy;

	/**
	 * AGC-standard auditing column createdDate which allows for automatic DML
	 * auditing
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREAT_DT")
    @CreatedDate
	protected Date createdDate;

	/**
	 * AGC-standard auditing column updatedBy which allows for automatic DML
	 * auditing
	 */
	@Column(name = "UPDT_BY")
	@LastModifiedBy
	protected U updatedBy;

	/**
	 * AGC-standard auditing column updatedDate which allows for automatic DML
	 * auditing
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDT_DT")
	@LastModifiedDate
	protected Date updatedDate;

	/** List of validation messages to be sent to AngularJS application. */
	@Transient
	private List<Message> messages;

	public BaseModel() {
		super();
	}

	public BaseModel(U createdBy, Date createdDate) {
		super();
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	/**
	 * @return String - the createdBy for the order
	 */
	public U getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param String createdBy - the createdBy to set for the order
	 * @return void
	 */
	public void setCreatedBy(final U createdBy) {

		this.createdBy = createdBy;
	}

	/**
	 * @return Date - the createdDate for the order
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param Date createdDate - the createdDate to set for the order
	 * @return void
	 */
	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return String - the updatedBy for the order
	 */
	public U getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param String updatedBy - the updatedBy to set for the order
	 * @return void
	 */
	public void setUpdatedBy(final U updatedBy) {
			this.updatedBy = updatedBy;
	}

	/**
	 * @return Date - the updatedDate for the order
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param Date updatedDate - the updatedDate to set for the order
	 * @return void
	 */
	public void setUpdatedDate(final Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Returns a multi-line String with key=value pairs.
	 * 
	 * @return a String representation of this class.
	 */
	public abstract String toString();

	/**
	 * Compares object equality. When using Hibernate, the primary key should not be
	 * a part of this comparison.
	 * 
	 * @param Object object to compare to
	 * @return true/false based on equality tests
	 */
	public abstract boolean equals(final Object object);

	/**
	 * When you override equals, you should override hashCode. See "Why are *
	 * equals() and hashCode() importation" for more information:
	 * http://www.hibernate.org/109.html
	 * 
	 * @return hashCode
	 */
	public abstract int hashCode();
}