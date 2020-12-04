package com.test.practice.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Fee {
	@Id
	@GeneratedValue
	private long feeid;
	private Date paid_date;
	private long tuition;
	private long library;
	private long lab;
	private long miscallenous;
	private long due;
	private long total;
	private long paid;
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;
	public long getFeeid() {
		return feeid;
	}
	public void setFeeid(long feeid) {
		this.feeid = feeid;
	}
	public Date getPaid_date() {
		return paid_date;
	}
	public void setPaid_date(Date paid_date) {
		this.paid_date = paid_date;
	}
	public long getTuition() {
		return tuition;
	}
	public void setTuition(long tuition) {
		this.tuition = tuition;
	}
	public long getLibrary() {
		return library;
	}
	public void setLibrary(long library) {
		this.library = library;
	}
	public long getLab() {
		return lab;
	}
	public void setLab(long lab) {
		this.lab = lab;
	}
	public long getMiscallenous() {
		return miscallenous;
	}
	public void setMiscallenous(long miscallenous) {
		this.miscallenous = miscallenous;
	}
	public long getDue() {
		return due;
	}
	public void setDue(long due) {
		this.due = due;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public long getPaid() {
		return paid;
	}
	public void setPaid(long paid) {
		this.paid = paid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
