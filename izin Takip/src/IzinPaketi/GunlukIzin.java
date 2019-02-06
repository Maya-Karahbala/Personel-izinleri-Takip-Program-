/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzinPaketi;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author scramblebit
 */
@Entity
@Table(name = "GUNLUK_IZIN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GunlukIzin.findAll", query = "SELECT g FROM GunlukIzin g")
    , @NamedQuery(name = "GunlukIzin.findById", query = "SELECT g FROM GunlukIzin g WHERE g.id = :id")
    , @NamedQuery(name = "GunlukIzin.findByPid", query = "SELECT g FROM GunlukIzin g WHERE g.pid = :pid")
    , @NamedQuery(name = "GunlukIzin.findByTur", query = "SELECT g FROM GunlukIzin g WHERE g.tur = :tur")
    , @NamedQuery(name = "GunlukIzin.findByBaslangicTarihi", query = "SELECT g FROM GunlukIzin g WHERE g.baslangicTarihi = :baslangicTarihi")
    , @NamedQuery(name = "GunlukIzin.findByBitisTarihi", query = "SELECT g FROM GunlukIzin g WHERE g.bitisTarihi = :bitisTarihi")
    , @NamedQuery(name = "GunlukIzin.findBySure", query = "SELECT g FROM GunlukIzin g WHERE g.sure = :sure")})
public class GunlukIzin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PID")
    private Integer pid;
    @Column(name = "TUR")
    private String tur;
    @Column(name = "BASLANGIC_TARIHI")
    @Temporal(TemporalType.DATE)
    private Date baslangicTarihi;
    @Column(name = "BITIS_TARIHI")
    @Temporal(TemporalType.DATE)
    private Date bitisTarihi;
    @Column(name = "SURE")
    private Integer sure;

    public GunlukIzin() {
    }

    public GunlukIzin(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public Integer getSure() {
        return sure;
    }

    public void setSure(Integer sure) {
        this.sure = sure;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GunlukIzin)) {
            return false;
        }
        GunlukIzin other = (GunlukIzin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IzinPaketi.GunlukIzin[ id=" + id + " ]";
    }

    public GunlukIzin(Integer id, Integer pid, String tur, Date baslangicTarihi, Date bitisTarihi, Integer sure) {
        this.id = id;
        this.pid = pid;
        this.tur = tur;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.sure = sure;
    }
    
}
