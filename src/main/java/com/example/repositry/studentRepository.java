package com.example.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.student;

public interface studentRepository extends JpaRepository<student, Integer> 
{


}
