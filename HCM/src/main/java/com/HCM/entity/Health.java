package com.HCM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="health")
public class Health {


	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="userid")
	private String userid;
	
	@Column(name="userpassword")
	private String userpassword;
	
	
	@Column(name="username")
	private String username;
	
	@Column(name="doctor")
	private String doctor;
	
	@Column(name="patient")
	private String patient;
	
	@Column(name="date")
	private String date;
	
	public Health(int id, String userid, String userpassword, String username, String doctor, String patient,
			String date, String appointment) {
		super();
		this.id = id;
		this.userid = userid;
		this.userpassword = userpassword;
		this.username = username;
		this.doctor = doctor;
		this.patient = patient;
		this.date = date;
		this.appointment = appointment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}

	@Column(name="appointment")
	private String appointment;

	
}
