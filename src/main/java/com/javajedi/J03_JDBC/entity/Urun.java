package com.javajedi.J03_JDBC.entity;

public class Urun {
    Long id;
    Long kategoriId;
    String ad;
    Double fiyat;
    String aciklama;
    String resim;

    public Urun() {
    }

    public Urun(Long id, Long kategoriId, String ad, Double fiyat, String aciklama, String resim) {
        this.id = id;
        this.kategoriId = kategoriId;
        this.ad = ad;
        this.fiyat = fiyat;
        this.aciklama = aciklama;
        this.resim = resim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Long kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Urun{");
        sb.append("id=").append(id);
        sb.append(", kategoriId=").append(kategoriId);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", aciklama='").append(aciklama).append('\'');
        sb.append(", resim='").append(resim).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
