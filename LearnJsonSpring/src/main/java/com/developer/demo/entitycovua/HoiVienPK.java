/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.demo.entitycovua;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author bossbaby
 */
@Embeddable
public class HoiVienPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDCLB")
    private String idclb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDHOIVIEN")
    private String iDHoiVien;

    public HoiVienPK() {
    }

    public HoiVienPK(String idclb, String iDHoiVien) {
        this.idclb = idclb;
        this.iDHoiVien = iDHoiVien;
    }

    public String getIdclb() {
        return idclb;
    }

    public void setIdclb(String idclb) {
        this.idclb = idclb;
    }

    public String getIDHoiVien() {
        return iDHoiVien;
    }

    public void setIDHoiVien(String iDHoiVien) {
        this.iDHoiVien = iDHoiVien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclb != null ? idclb.hashCode() : 0);
        hash += (iDHoiVien != null ? iDHoiVien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoiVienPK)) {
            return false;
        }
        HoiVienPK other = (HoiVienPK) object;
        if ((this.idclb == null && other.idclb != null) || (this.idclb != null && !this.idclb.equals(other.idclb))) {
            return false;
        }
        if ((this.iDHoiVien == null && other.iDHoiVien != null) || (this.iDHoiVien != null && !this.iDHoiVien.equals(other.iDHoiVien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.developer.demo.entitycovua.HoiVienPK[ idclb=" + idclb + ", iDHoiVien=" + iDHoiVien + " ]";
    }
    
}
