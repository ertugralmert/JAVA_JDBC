package com.javajedi.J02_JDBC.crud;

import java.sql.SQLException;
import java.util.Scanner;

public class RunnerCrud_Devam {
    public static void main(String[] args) throws SQLException {
        // Şimdi kullanıcıdan bir değer alarak ekleme işlemi yapalım
        CRUD crud = new CRUD("SatisDB");
        System.out.println("""
                **** Satış Uygulaması ****
                1- Urun Ekleme
                2- Urun Sil
                3- Ürün Güncelle
                4- Ürün Listele
                """);
        System.out.print("seciniz");
        int secim = new Scanner(System.in).nextInt();
        if(secim == 1){
            System.out.print("ürün adı:");
            String urunAdi = new Scanner(System.in).nextLine();
            System.out.println("ürün fiyatı:");
            double urunFiyat = new Scanner(System.in).nextDouble();
            System.out.print("ürün açıklaması: ");
            String aciklama = new Scanner(System.in).nextLine();
            String SQL = "insert into tblurun(ad,fiyat,aciklama) values ('"+urunAdi+"','"+urunFiyat+"','"+aciklama+"')";
            crud.executeUpdate(SQL);
        }
    }
}
