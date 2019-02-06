/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonelPaketi;

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
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p")
    , @NamedQuery(name = "Personel.findById", query = "SELECT p FROM Personel p WHERE p.id = :id")
    , @NamedQuery(name = "Personel.findByAdi", query = "SELECT p FROM Personel p WHERE p.adi = :adi")
    , @NamedQuery(name = "Personel.findBySoyadi", query = "SELECT p FROM Personel p WHERE p.soyadi = :soyadi")
    , @NamedQuery(name = "Personel.findByTcNo", query = "SELECT p FROM Personel p WHERE p.tcNo = :tcNo")
    , @NamedQuery(name = "Personel.findByTelefonNo", query = "SELECT p FROM Personel p WHERE p.telefonNo = :telefonNo")
    , @NamedQuery(name = "Personel.findByCinsiyet", query = "SELECT p FROM Personel p WHERE p.cinsiyet = :cinsiyet")
    , @NamedQuery(name = "Personel.findByMaas", query = "SELECT p FROM Personel p WHERE p.maas = :maas")
    , @NamedQuery(name = "Personel.findByGirisTarihi", query = "SELECT p FROM Personel p WHERE p.girisTarihi = :girisTarihi")
    , @NamedQuery(name = "Personel.findByCalismaSuresi", query = "SELECT p FROM Personel p WHERE p.calismaSuresi = :calismaSuresi")
    , @NamedQuery(name = "Personel.findByYillikIzin", query = "SELECT p FROM Personel p WHERE p.yillikIzin = :yillikIzin")
    , @NamedQuery(name = "Personel.findByKullanilanIzin", query = "SELECT p FROM Personel p WHERE p.kullanilanIzin = :kullanilanIzin")
    , @NamedQuery(name = "Personel.findByKalanIzin", query = "SELECT p FROM Personel p WHERE p.kalanIzin = :kalanIzin")
    , @NamedQuery(name = "Personel.findByKullanilanSaat", query = "SELECT p FROM Personel p WHERE p.kullanilanSaat = :kullanilanSaat")
    , @NamedQuery(name = "Personel.findByKalanSaat", query = "SELECT p FROM Personel p WHERE p.kalanSaat = :kalanSaat")})
public class Personel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "TC_NO")
    private Integer tcNo;
    @Column(name = "TELEFON_NO")
    private Integer telefonNo;
    @Column(name = "CINSIYET")
    private Boolean cinsiyet;
    @Column(name = "MAAS")
    private Integer maas;
    @Column(name = "GIRIS_TARIHI")
    @Temporal(TemporalType.DATE)
    private Date girisTarihi;
    @Column(name = "CALISMA_SURESI")
    private Integer calismaSuresi;
    @Column(name = "YILLIK_IZIN")
    private Integer yillikIzin;
    @Column(name = "KULLANILAN_IZIN")
    private Integer kullanilanIzin;
    @Column(name = "KALAN_IZIN")
    private Integer kalanIzin;
    @Column(name = "KULLANILAN_SAAT")
    private Integer kullanilanSaat;
    @Column(name = "KALAN_SAAT")
    private Integer kalanSaat;

    public Personel() {
    }

    public Personel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Integer getTcNo() {
        return tcNo;
    }

    public void setTcNo(Integer tcNo) {
        this.tcNo = tcNo;
    }

    public Integer getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(Integer telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Boolean getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public Date getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(Date girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public Integer getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(Integer calismaSuresi) {
        this.calismaSuresi = calismaSuresi;
    }

    public Integer getYillikIzin() {
        return yillikIzin;
    }

    public void setYillikIzin(Integer yillikIzin) {
        this.yillikIzin = yillikIzin;
    }

    public Integer getKullanilanIzin() {
        return kullanilanIzin;
    }

    public void setKullanilanIzin(Integer kullanilanIzin) {
        this.kullanilanIzin = kullanilanIzin;
    }

    public Integer getKalanIzin() {
        return kalanIzin;
    }

    public void setKalanIzin(Integer kalanIzin) {
        this.kalanIzin = kalanIzin;
    }

    public Integer getKullanilanSaat() {
        return kullanilanSaat;
    }

    public void setKullanilanSaat(Integer kullanilanSaat) {
        this.kullanilanSaat = kullanilanSaat;
    }

    public Integer getKalanSaat() {
        return kalanSaat;
    }

    public void setKalanSaat(Integer kalanSaat) {
        this.kalanSaat = kalanSaat;
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
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonelPaketi.Personel[ id=" + id + " ]";
    }

    public Personel(Integer id, String adi, String soyadi, Integer tcNo, Integer telefonNo, Boolean cinsiyet, Integer maas, Date girisTarihi, Integer calismaSuresi, Integer yillikIzin, Integer kullanilanIzin, Integer kalanIzin, Integer kullanilanSaat, Integer kalanSaat) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.tcNo = tcNo;
        this.telefonNo = telefonNo;
        this.cinsiyet = cinsiyet;
        this.maas = maas;
        this.girisTarihi = girisTarihi;
        this.calismaSuresi = calismaSuresi;
        this.yillikIzin = yillikIzin;
        this.kullanilanIzin = kullanilanIzin;
        this.kalanIzin = kalanIzin;
        this.kullanilanSaat = kullanilanSaat;
        this.kalanSaat = kalanSaat;
    }
    
}
