package DTO.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DTO.com.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
