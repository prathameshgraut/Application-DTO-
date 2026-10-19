package DTO.com.dtoclass;

import jakarta.persistence.Entity;

@Entity
public class ApplicationDto { 
	private String StudentName;
	private String StudentAddress;
	private String StudentEamil;
	private int amount;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public String getStudentEamil() {
		return StudentEamil;
	}
	public void setStudentEamil(String studentEamil) {
		StudentEamil = studentEamil;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ApplicationDto [StudentName=" + StudentName + ", StudentAddress=" + StudentAddress + ", StudentEamil="
				+ StudentEamil + ", amount=" + amount + "]";
	}
	
	
	
	
}
