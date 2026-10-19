package DTO.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DTO.com.Entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {

}
