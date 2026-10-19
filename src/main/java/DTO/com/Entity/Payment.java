package DTO.com.Entity;

import jakarta.persistence.Entity;

@Entity
public class Payment {
	
	private int id;
	private int amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
