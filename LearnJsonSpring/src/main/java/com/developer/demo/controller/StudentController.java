/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.controller;


import com.developer.demo.entitycovua.Clb;
import com.developer.demo.entitycovua.HoiVien;
import com.developer.demo.repository.ClbRepository;
import com.developer.demo.repository.HoiVienRepository;
import com.developer.demo.service.HoiVienService;
import com.developer.demo.service.StudentService;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 *
 * @author bossbaby
 */


@RestController
public class StudentController {
     
    
    private StudentService studentService;
    //private HoiVienService hoivienService;
    private HoiVienRepository hoivienService;
    @Autowired
    private ClbRepository clbrepository;

    @Autowired
    public void setProductService(StudentService studentService) {
        this.studentService = studentService;
    }
    
    
    @RequestMapping(value="/greeting", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Clb> greeting() {
        
        return clbrepository.findAll();
       
    }
  
    
}
