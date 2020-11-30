package com.hibernate.inclass.inclasshibernatelesson.repository;

import com.hibernate.inclass.inclasshibernatelesson.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
