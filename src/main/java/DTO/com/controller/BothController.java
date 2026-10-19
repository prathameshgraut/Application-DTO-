package DTO.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import DTO.com.Service.PaymentService;
import DTO.com.Service.StudentService;
import DTO.com.dtoclass.ApplicationDto;

@RestController
public class BothController {

	@Autowired
	StudentService Stdservice;
	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping("add")
	public void addRecord(@RequestBody ApplicationDto applicationDto) {
		Stdservice.addStudent(applicationDto);
	}
}
