/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.entitycovua;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author bossbaby
 */
@Entity
@Table(name = "HOIVIEN")
@NamedQueries({
    @NamedQuery(name = "HoiVien.findAll", query = "SELECT h FROM HoiVien h")
    , @NamedQuery(name = "HoiVien.findByIdclb", query = "SELECT h FROM HoiVien h WHERE h.hoiVienPK.idclb = :idclb")
    , @NamedQuery(name = "HoiVien.findByIDHoiVien", query = "SELECT h FROM HoiVien h WHERE h.hoiVienPK.iDHoiVien = :iDHoiVien")
    , @NamedQuery(name = "HoiVien.findByHoTen", query = "SELECT h FROM HoiVien h WHERE h.hoTen = :hoTen")
    , @NamedQuery(name = "HoiVien.findByNgaySinh", query = "SELECT h FROM HoiVien h WHERE h.ngaySinh = :ngaySinh")})
public class HoiVien implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HoiVienPK hoiVienPK;
    @Size(max = 30)
    @Column(name = "HOTEN")
    private String hoTen;
    @Column(name = "NGAYSINH")
    @Temporal(TemporalType.DATE)
    private Date ngaySinh;
    @JoinColumn(name = "IDCLB", referencedColumnName = "IDCLB", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clb clb;
    @JoinColumns({
        @JoinColumn(name = "IDCLB", referencedColumnName = "IDCLB", insertable = false, updatable = false)
        , @JoinColumn(name = "IDDoi", referencedColumnName = "IDDoi", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Doi doi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoiVien")
    private List<HoiVien> hoiVienList;
    @JoinColumns({
        @JoinColumn(name = "IDCLB", referencedColumnName = "IDCLB", insertable = false, updatable = false)
        , @JoinColumn(name = "IDBANCUNGTAPLUYEN", referencedColumnName = "IDHoiVien", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private HoiVien hoiVien;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoiVien")
    private List<Doi> doiList;

    public HoiVien() {
    }

    public HoiVien(HoiVienPK hoiVienPK) {
        this.hoiVienPK = hoiVienPK;
    }

    public HoiVien(String idclb, String iDHoiVien) {
        this.hoiVienPK = new HoiVienPK(idclb, iDHoiVien);
    }

    public HoiVienPK getHoiVienPK() {
        return hoiVienPK;
    }

    public void setHoiVienPK(HoiVienPK hoiVienPK) {
        this.hoiVienPK = hoiVienPK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Clb getClb() {
        return clb;
    }

    public void setClb(Clb clb) {
        this.clb = clb;
    }

    public Doi getDoi() {
        return doi;
    }

    public void setDoi(Doi doi) {
        this.doi = doi;
    }

    public List<HoiVien> getHoiVienList() {
        return hoiVienList;
    }

    public void setHoiVienList(List<HoiVien> hoiVienList) {
        this.hoiVienList = hoiVienList;
    }

    public HoiVien getHoiVien() {
        return hoiVien;
    }

    public void setHoiVien(HoiVien hoiVien) {
        this.hoiVien = hoiVien;
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
        hash += (hoiVienPK != null ? hoiVienPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoiVien)) {
            return false;
        }
        HoiVien other = (HoiVien) object;
        if ((this.hoiVienPK == null && other.hoiVienPK != null) || (this.hoiVienPK != null && !this.hoiVienPK.equals(other.hoiVienPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.developer.demo.entitycovua.HoiVien[ hoiVienPK=" + hoiVienPK + " ]";
    }
    
}
