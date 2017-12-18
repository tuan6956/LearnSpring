/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.entitycovua;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bossbaby
 */
@Entity
@Table(name = "CLB")
@NamedQueries({
    @NamedQuery(name = "Clb.findAll", query = "SELECT c FROM Clb c")
    , @NamedQuery(name = "Clb.findByIdclb", query = "SELECT c FROM Clb c WHERE c.idclb = :idclb")
    , @NamedQuery(name = "Clb.findByTenCLB", query = "SELECT c FROM Clb c WHERE c.tenCLB = :tenCLB")
    , @NamedQuery(name = "Clb.findByDiaChi", query = "SELECT c FROM Clb c WHERE c.diaChi = :diaChi")})
@JsonIgnoreProperties(ignoreUnknown=true)
public class Clb implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDCLB")
    private String idclb;
    @Size(max = 50)
    @Column(name = "TENCLB")
    private String tenCLB;
    @Size(max = 40)
    @Column(name = "DIACHI")
    private String diaChi;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "clb")
    @JsonIgnoreProperties(value = "IDCLB", allowSetters = true)
    private List<HoiVien> hoiVienList;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "clb")
    private List<Doi> doiList;

    public Clb() {
    }

    public Clb(String idclb) {
        this.idclb = idclb;
    }

    public String getIdclb() {
        return idclb;
    }

    public void setIdclb(String idclb) {
        this.idclb = idclb;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<HoiVien> getHoiVienList() {
        return hoiVienList;
    }

    public void setHoiVienList(List<HoiVien> hoiVienList) {
        this.hoiVienList = hoiVienList;
    }

    public List<Doi> getDoiList() {
        return doiList;
    }

    public void setDoiList(List<Doi> doiList) {
        this.doiList = doiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclb != null ? idclb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clb)) {
            return false;
        }
        Clb other = (Clb) object;
        if ((this.idclb == null && other.idclb != null) || (this.idclb != null && !this.idclb.equals(other.idclb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.developer.demo.entitycovua.Clb[ idclb=" + idclb + " ]";
    }
    
}
