/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.repository;

import java.util.List;

import com.developer.demo.controller.Student;
import com.developer.demo.entitycovua.Clb;
import com.developer.demo.entitycovua.HoiVien;
import com.developer.demo.entitycovua.HoiVienPK;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author bossbaby
 */
@Repository
public interface ClbRepository extends CrudRepository<Clb, String> {
    
}
