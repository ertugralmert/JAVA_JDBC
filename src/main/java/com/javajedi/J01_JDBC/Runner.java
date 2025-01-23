package com.javajedi.J01_JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner {
    /**
     * Öncelikli link : https://mvnrepository.com/artifact/org.postgresql/postgresql/42.7.3
     * sonrasında
     * biz bu projelerimizde Gradle kullanıyoruz gradle seçip kopyalayıp
     * build.gradle dosyasına yapıştırıyoruz -> depencies kısmına
     * build.gradle kısmında depencies kısmı aşağıdaki gibi olmalı
     * dependencies {
     *     testImplementation platform('org.junit:junit-bom:5.10.0')
     *     testImplementation 'org.junit.jupiter:junit-jupiter'
     *     // https://mvnrepository.com/artifact/org.postgresql/postgresql
     *     implementation group: 'org.postgresql', name: 'postgresql', version: '42.7.3'
     *
     * }
     * IDE'den build ediyoruz.
     * burada bağlanmak istediğimiz DB'ye ait Driver I kullanacağımız belirlitoyurz
     */
    public static void main(String[] args) throws Exception {
    Driver.class.forName("org.postgresql.Driver");
        /**
         * 2 - Bağlantı açılması gereklidir. Bunun için gereken bilgiler işlenebilir.
         * Adres bilgisini işlenirken Connection String adı verilen bir syntax kullanılır.
         * Syntax: jdbc:postgresql://host(IP):port/database
         */
        String adres = "jdbc:postgresql://localhost:5432/SatisDB";
        // pgadmin de oluşturduğumuz SatisDB database var. içinde tblmusteri table var
        String kullaniciAdi = "postgres";
        String sifre = "root";
        Connection conn = DriverManager.getConnection(adres,kullaniciAdi,sifre);

        // Şimdi DB'ye vereceğimiz emir cümlesini hazırlıyoruz.
        String SQL = "insert into tblmusteri(ad,soyad,adres,telefon)" +
                "values('Java','Programlama','Ankara','555555555')";
        // String SQL = "update from tblmusteri set adres='Ankara' ; ->> tüm adresleri ankara yapar
        // String SQL = "delete from tblmusteri where id>20"; // id 20 silinir.
        PreparedStatement pr = conn.prepareCall(SQL);
        // İlgili emri uyguluyoruz
        pr.executeUpdate();
        //Bağlantıyı kapatıyoruz.
        conn.close();
        System.out.println("Bağlantı kapatıldı");


    }
}
