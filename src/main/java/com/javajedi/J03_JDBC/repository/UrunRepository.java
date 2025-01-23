package com.javajedi.J03_JDBC.repository;

import com.javajedi.J02_JDBC.crud.CRUD;
import com.javajedi.J03_JDBC.entity.Urun;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UrunRepository {
    // CRUD işlemleri olacak
    // oluşturduğumuz CRUD sınıfını burada kullanalım
    private final CRUD crud;
    private ResultSet resultSet;
    public UrunRepository(){
        this.crud = new CRUD("SatisDB");
    }
    public void save (Urun urun) throws SQLException {
    String sql = "insert into tblurun(ad,aciklama,resim,fiyat,kategoriId) values ('"+urun.getAd()+"','"+urun.getAciklama()+"','"+urun.getResim()+"','"+urun.getFiyat()+"','"+urun.getKategoriId()+"')";
    crud.executeUpdate(sql);
    }

    public void update(Urun urun){

    }
    public void delete(Long id) throws SQLException {
    String sql = "delete fron where id = "+id;
    crud.executeUpdate(sql);
    }

    public List<Urun> findAll() throws SQLException {
        List<Urun> urunListesi = new ArrayList<>();
        String sql = "select * from tblurun";
        resultSet = crud.executeQuery(sql);
        while(resultSet.next()){
            Long id = resultSet.getLong("id");
            String ad = resultSet.getString("ad");
            String aciklama = resultSet.getString("aciklama");
            String resim = resultSet.getString("resim");
            Double fiyat = resultSet.getDouble("fiyat");
            Long kategoriId = resultSet.getLong("kategori_id");
            Urun urun = new Urun(id,kategoriId,ad,fiyat,aciklama,resim);
            urunListesi.add(urun);
        }
        return urunListesi;
    }
}
