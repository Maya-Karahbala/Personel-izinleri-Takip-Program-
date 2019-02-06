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
@Table(name = "SAATLIK_IZIN1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaatlikIzin1.findAll", query = "SELECT s FROM SaatlikIzin1 s")
    , @NamedQuery(name = "SaatlikIzin1.findById", query = "SELECT s FROM SaatlikIzin1 s WHERE s.id = :id")
    , @NamedQuery(name = "SaatlikIzin1.findByPid", query = "SELECT s FROM SaatlikIzin1 s WHERE s.pid = :pid")
    , @NamedQuery(name = "SaatlikIzin1.findByTur", query = "SELECT s FROM SaatlikIzin1 s WHERE s.tur = :tur")
    , @NamedQuery(name = "SaatlikIzin1.findByTarih", query = "SELECT s FROM SaatlikIzin1 s WHERE s.tarih = :tarih")
    , @NamedQuery(name = "SaatlikIzin1.findByBasSaat", query = "SELECT s FROM SaatlikIzin1 s WHERE s.basSaat = :basSaat")
    , @NamedQuery(name = "SaatlikIzin1.findByBitSaat", query = "SELECT s FROM SaatlikIzin1 s WHERE s.bitSaat = :bitSaat")
    , @NamedQuery(name = "SaatlikIzin1.findBySure", query = "SELECT s FROM SaatlikIzin1 s WHERE s.sure = :sure")})
public class SaatlikIzin1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PID")
    private Integer pid;
    @Column(name = "TUR")
    private String tur;
    @Column(name = "TARIH")
    @Temporal(TemporalType.DATE)
    private Date tarih;
    @Column(name = "BAS_SAAT")
    private String basSaat;
    @Column(name = "BIT_SAAT")
    private String bitSaat;
    @Column(name = "SURE")
    private Integer sure;

    public SaatlikIzin1() {
    }

    public SaatlikIzin1(Integer id) {
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

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public String getBasSaat() {
        return basSaat;
    }

    public void setBasSaat(String basSaat) {
        this.basSaat = basSaat;
    }

    public String getBitSaat() {
        return bitSaat;
    }

    public void setBitSaat(String bitSaat) {
        this.bitSaat = bitSaat;
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
        if (!(object instanceof SaatlikIzin1)) {
            return false;
        }
        SaatlikIzin1 other = (SaatlikIzin1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IzinPaketi.SaatlikIzin1[ id=" + id + " ]";
    }

    public SaatlikIzin1(Integer id, Integer pid, String tur, Date tarih, String basSaat, String bitSaat, Integer sure) {
        this.id = id;
        this.pid = pid;
        this.tur = tur;
        this.tarih = tarih;
        this.basSaat = basSaat;
        this.bitSaat = bitSaat;
        this.sure = sure;
    }
    
    
}
