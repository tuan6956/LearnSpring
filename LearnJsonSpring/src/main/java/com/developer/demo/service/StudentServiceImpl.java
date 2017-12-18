/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.service;


import com.developer.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.developer.demo.controller.Student;

/**
 *
 * @author bossbaby
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentrepository;
   
    @Override
    public Iterable<Student> findAll() {
        return studentrepository.findAll();
    }
}
