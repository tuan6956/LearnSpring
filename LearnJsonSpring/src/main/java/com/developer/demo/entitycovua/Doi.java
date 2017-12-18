/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.entitycovua;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author bossbaby
 */
@Entity
@Table(name = "DOI")
@NamedQueries({
    @NamedQuery(name = "Doi.findAll", query = "SELECT d FROM Doi d")
    , @NamedQuery(name = "Doi.findByIdclb", query = "SELECT d FROM Doi d WHERE d.doiPK.idclb = :idclb")
    , @NamedQuery(name = "Doi.findByIDDoi", query = "SELECT d FROM Doi d WHERE d.doiPK.iDDoi = :iDDoi")
    , @NamedQuery(name = "Doi.findByTen", query = "SELECT d FROM Doi d WHERE d.ten = :ten")})
public class Doi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DoiPK doiPK;
    @Size(max = 30)
    @Column(name = "Ten")
    private String ten;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doi")
    private List<HoiVien> hoiVienList;
    @JoinColumn(name = "IDCLB", referencedColumnName = "IDCLB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clb clb;
    @JoinColumns({
        @JoinColumn(name = "IDCLB", referencedColumnName = "IDCLB", insertable = false, updatable = false)
        , @JoinColumn(name = "IDDOITRUONG", referencedColumnName = "IDHoiVien", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private HoiVien hoiVien;

    public Doi() {
    }

    public Doi(DoiPK doiPK) {
        this.doiPK = doiPK;
    }

    public Doi(String idclb, String iDDoi) {
        this.doiPK = new DoiPK(idclb, iDDoi);
    }

    public DoiPK getDoiPK() {
        return doiPK;
    }

    public void setDoiPK(DoiPK doiPK) {
        this.doiPK = doiPK;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<HoiVien> getHoiVienList() {
        return hoiVienList;
    }

    public void setHoiVienList(List<HoiVien> hoiVienList) {
        this.hoiVienList = hoiVienList;
    }

    public Clb getClb() {
        return clb;
    }

    public void setClb(Clb clb) {
        this.clb = clb;
    }

    public HoiVien getHoiVien() {
        return hoiVien;
    }


    public void setHoiVien(HoiVien hoiVien2) {
        this.hoiVien = hoiVien2;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doiPK != null ? doiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doi)) {
            return false;
        }
        Doi other = (Doi) object;
        if ((this.doiPK == null && other.doiPK != null) || (this.doiPK != null && !this.doiPK.equals(other.doiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.developer.demo.entitycovua.Doi[ doiPK=" + doiPK + " ]";
    }
    
}
