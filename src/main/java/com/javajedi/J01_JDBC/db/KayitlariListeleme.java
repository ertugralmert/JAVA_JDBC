package com.javajedi.J01_JDBC.db;

import org.postgresql.Driver;

import java.sql.*;

public class KayitlariListeleme {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Driver.class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SatisDB",
                "postgres",
                "root"
        );
        String SQL = "select * from tblurun";
        PreparedStatement pr = conn.prepareCall(SQL);
        // SQL sorugusu işletilerek DB den gelen kayıtları REsultSet olarak dönülür.
        ResultSet rs =  pr.executeQuery(); // sonuç döndüğü için update değil Query
        /**
         * Eğer result set içinde gelen dataları üzerinde gezinmek istiyorsanız tüm satırları
         * tek tek gezmeniz gerekecektir. Bu işlemi yapmak için ise bir bir döngü kullanabiliriz.
         * Özellile while döngüsü bu işlem için uygundur. Satırlar arasında bir alt satıra
         * geçmek için next() methodu kullanılır.
         */
        while(rs.next()){ // son satır gelene kadar dönmeye devam et.
        String urunAdi = rs.getString("ad");
        double urunFiyat = rs.getDouble("fiyat");
            System.out.println("ürün adı: "+ urunAdi);
            System.out.println("ürün fiyatı: "+ urunFiyat);
        }
        /**
         * > Task :KayitlariListeleme.main()
         * ürün adı: deneme2
         * ürün fiyatı: 34000.0
         * ürün adı: Canon Pixima 322
         * ürün fiyatı: 8500.0
         * ürün adı: Hp A122
         * ürün fiyatı: 1300.0
         * ürün adı: Asrock Anakart
         * ürün fiyatı: 5400.0
         * ürün adı: Intel Xeon Islemci
         * ürün fiyatı: 4200.0
         * ürün adı: Kiingstone Ram 128Gb
         * ürün fiyatı: 19000.0
         * ürün adı: Samsung EVO 1Tb
         * ürün fiyatı: 32000.0
         * ürün adı: ViewSonic 32 inch
         * ürün fiyatı: 5433.0
         * ürün adı: Monitor Askı Aparatı
         * ürün fiyatı: 870.0
         * ürün adı: HDMI kablo
         * ürün fiyatı: 250.0
         * ürün adı: Kablosuz Modem Yükseltici
         * ürün fiyatı: 2250.0
         * ürün adı: Iphone 15 Pro Max 1Tb
         * ürün fiyatı: 102000.0
         * ürün adı: Samsung S24 Pro
         * ürün fiyatı: 76000.0
         * ürün adı: Redmi Note 13
         * ürün fiyatı: 22500.0
         * ürün adı: Oppo
         * ürün fiyatı: 16000.0
         * ürün adı: Samsung A7
         * ürün fiyatı: 24900.0
         * ürün adı: Samsung Note 10
         * ürün fiyatı: 34500.0
         * ürün adı: Appe Watch 9
         * ürün fiyatı: 19999.0
         * ürün adı: Samsung
         * ürün fiyatı: 10999.0
         * ürün adı: Sony 82 inch
         * ürün fiyatı: 77999.0
         * ürün adı: Samsung 8K Ultra
         * ürün fiyatı: 122999.0
         * ürün adı: Toshiba 42 inch fullHD
         * ürün fiyatı: 14999.0
         * ürün adı: Samsung 3D 50 inch
         * ürün fiyatı: 34500.0
         * ürün adı: JBL ultra sound perfect
         * ürün fiyatı: 19999.0
         * ürün adı: Sony fullHD outside
         * ürün fiyatı: 29999.0
         * ürün adı: LG compact 1200 lümen
         * ürün fiyatı: 14000.0
         * ürün adı: Acer 720p
         * ürün fiyatı: 4599.0
         * ürün adı: Apple Watch Ultra
         * ürün fiyatı: 39500.0
         * ürün adı: MertUrunu
         * ürün fiyatı: 99999.0
         * ürün adı: Laptop i90
         * ürün fiyatı: 0.0
         */


    }
}
