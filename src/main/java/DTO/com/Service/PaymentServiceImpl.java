package DTO.com.Service;

import org.springframework.beans.factory.annotation.Autowired;

import DTO.com.Repository.PaymentRepo;

public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepo paymentRepo;
	
	@Override
	public Integer paymentHistory(int amount) {
		return amount;
	}

}
