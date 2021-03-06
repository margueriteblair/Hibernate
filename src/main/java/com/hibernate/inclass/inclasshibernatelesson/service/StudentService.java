package com.hibernate.inclass.inclasshibernatelesson.service;


import com.hibernate.inclass.inclasshibernatelesson.entity.Student;
import com.hibernate.inclass.inclasshibernatelesson.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //service holding the logic for our object
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student getStudentsByName(String name) {
        return repo.findByName(name);
    }

    public void deleteStudent(int id) {
        repo.deleteById(id);
    }

    public Student updateStudent(Student student) {
        Student existingStudent = repo.findById(student.id).orElse(null);
        existingStudent.name = student.name;
        existingStudent.grade = student.grade;
        //this will cause a race condition
        return repo.save(existingStudent);
    }
}
