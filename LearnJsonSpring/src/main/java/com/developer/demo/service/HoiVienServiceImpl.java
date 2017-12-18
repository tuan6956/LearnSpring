/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.service;

import com.developer.demo.controller.Student;
import com.developer.demo.entitycovua.HoiVien;
import com.developer.demo.repository.HoiVienRepository;

import com.developer.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bossbaby
 */
@Service
public class HoiVienServiceImpl implements HoiVienService {
    @Autowired
    private HoiVienRepository hoivienrepository;
    @Override
    public Iterable<HoiVien> findAll(){
        return hoivienrepository.findAll();
    }
}
