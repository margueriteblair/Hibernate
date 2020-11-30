package com.hibernate.inclass.inclasshibernatelesson.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_table_test") //this is the name of the table we'll be using
public class Student {

    @Id //specifies the primary key for our entity
    @GeneratedValue //it'll autoincrement
    public int id; //primary key
    public String name;
    public double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }




}
