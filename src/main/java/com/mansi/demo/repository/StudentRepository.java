package com.mansi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mansi.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
