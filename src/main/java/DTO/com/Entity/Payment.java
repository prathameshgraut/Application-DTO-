package DTO.com.Entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Payment {
	
	private int amount;
	
}
