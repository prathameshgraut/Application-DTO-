package DTO.com.Service;

import org.springframework.beans.factory.annotation.Autowired;

import DTO.com.Entity.Payment;
import DTO.com.Entity.Student;
import DTO.com.Repository.PaymentRepo;
import DTO.com.Repository.StudentRepo;
import DTO.com.dtoclass.ApplicationDto;

public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo studentrepo;
	
	
	@Autowired
	PaymentRepo paymentRepo;


	@Override
	public void addStudent(ApplicationDto applicationDto) {
		
		Student s = new Student();
		s.setAddress(applicationDto.getStudentAddress());
		s.setEmail(applicationDto.getStudentEamil());
		s.setName(applicationDto.getStudentName());
		studentrepo.save(s);
		
		
		Payment p = new Payment();
		p.setAmount(applicationDto.getAmount());
		paymentRepo.save(p);
		
	}

	
	


}
