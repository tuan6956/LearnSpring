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
public class DoiPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDCLB")
    private String idclb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDDoi")
    private String iDDoi;

    public DoiPK() {
    }

    public DoiPK(String idclb, String iDDoi) {
        this.idclb = idclb;
        this.iDDoi = iDDoi;
    }

    public String getIdclb() {
        return idclb;
    }

    public void setIdclb(String idclb) {
        this.idclb = idclb;
    }

    public String getIDDoi() {
        return iDDoi;
    }

    public void setIDDoi(String iDDoi) {
        this.iDDoi = iDDoi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclb != null ? idclb.hashCode() : 0);
        hash += (iDDoi != null ? iDDoi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoiPK)) {
            return false;
        }
        DoiPK other = (DoiPK) object;
        if ((this.idclb == null && other.idclb != null) || (this.idclb != null && !this.idclb.equals(other.idclb))) {
            return false;
        }
        if ((this.iDDoi == null && other.iDDoi != null) || (this.iDDoi != null && !this.iDDoi.equals(other.iDDoi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.developer.demo.entitycovua.DoiPK[ idclb=" + idclb + ", iDDoi=" + iDDoi + " ]";
    }
    
}
