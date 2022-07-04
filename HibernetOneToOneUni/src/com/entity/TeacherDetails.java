package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="teacher_details")
public class TeacherDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	
	@Column(name="state")
	private String state;
	
	@Column(name="hoby")
	private String hoby;
	
	@Column(name="salary")
	private int salary;
	
	public TeacherDetails() {
		
	}
	public TeacherDetails( String state, String hoby, int salary) {
		super();
	
		this.state = state;
		this.hoby = hoby;
		this.salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHoby() {
		return hoby;
	}
	public void setHoby(String hoby) {
		this.hoby = hoby;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TeacherDetails [Id=" + Id + ", state=" + state + ", hoby=" + hoby + ", salary=" + salary + "]";
	}
	
	
	
}
