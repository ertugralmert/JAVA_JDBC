package com.javajedi.J03_JDBC;

import com.javajedi.J03_JDBC.entity.Urun;
import com.javajedi.J03_JDBC.repository.UrunRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws SQLException {
        // oluşturduğumuz repository class'ını burada kullanabliriz.
        UrunRepository urunRepository = new UrunRepository();
        System.out.println("""
                **** Satış Uygulaması ****
                1- Urun Ekleme
                2- Urun Sil
                3- Ürün Güncelle
                4- Ürün Listele
                """);
        System.out.print("seciniz");
        int secim = new Scanner(System.in).nextInt();
        if (secim == 1) {
            System.out.print("ürün adı:");
            String urunAdi = new Scanner(System.in).nextLine();
            System.out.println("ürün fiyatı:");
            double urunFiyat = new Scanner(System.in).nextDouble();
            System.out.print("ürün açıklaması: ");
            String aciklama = new Scanner(System.in).nextLine();

            urunRepository.save(new Urun(0L,3L,urunAdi,urunFiyat,aciklama,"https://resim"));
        }else if (secim == 2){
            System.out.println("Silinecek id: ");
            Long id = new Scanner(System.in).nextLong();
            urunRepository.delete(id);
        }else if ( secim == 4){
            urunRepository.findAll().forEach(System.out::println);
        }
    }
}
/**
 * 4 seçersek :
 * > Task :Runner.main()
 * **** Satış Uygulaması ****
 * 1- Urun Ekleme
 * 2- Urun Sil
 * 3- Ürün Güncelle
 * 4- Ürün Listele
 *
 * seciniz4
 * Urun{id=31, kategoriId=0, ad='deneme2', fiyat=34000.0, aciklama='deniyorum', resim='https'}
 * Urun{id=33, kategoriId=0, ad='Laptop i90', fiyat=0.0, aciklama='null', resim='null'}
 * Urun{id=1, kategoriId=4, ad='Canon Pixima 322', fiyat=8500.0, aciklama='Yeniden', resim='null'}
 * Urun{id=2, kategoriId=4, ad='Hp A122', fiyat=1300.0, aciklama='Yeniden', resim='null'}
 * Urun{id=3, kategoriId=5, ad='Asrock Anakart', fiyat=5400.0, aciklama='Yeniden', resim='null'}
 * Urun{id=4, kategoriId=5, ad='Intel Xeon Islemci', fiyat=4200.0, aciklama='Yeniden', resim='null'}
 * Urun{id=5, kategoriId=5, ad='Kiingstone Ram 128Gb', fiyat=19000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=6, kategoriId=5, ad='Samsung EVO 1Tb', fiyat=32000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=7, kategoriId=5, ad='ViewSonic 32 inch', fiyat=5433.0, aciklama='Yeniden', resim='null'}
 * Urun{id=8, kategoriId=6, ad='Monitor Askı Aparatı', fiyat=870.0, aciklama='Yeniden', resim='null'}
 * Urun{id=9, kategoriId=6, ad='HDMI kablo', fiyat=250.0, aciklama='Yeniden', resim='null'}
 * Urun{id=10, kategoriId=6, ad='Kablosuz Modem Yükseltici', fiyat=2250.0, aciklama='Yeniden', resim='null'}
 * Urun{id=11, kategoriId=7, ad='Iphone 15 Pro Max 1Tb', fiyat=102000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=12, kategoriId=7, ad='Samsung S24 Pro', fiyat=76000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=13, kategoriId=7, ad='Redmi Note 13', fiyat=22500.0, aciklama='Yeniden', resim='null'}
 * Urun{id=14, kategoriId=7, ad='Oppo', fiyat=16000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=15, kategoriId=7, ad='Samsung A7', fiyat=24900.0, aciklama='Yeniden', resim='null'}
 * Urun{id=16, kategoriId=7, ad='Samsung Note 10', fiyat=34500.0, aciklama='Yeniden', resim='null'}
 * Urun{id=17, kategoriId=8, ad='Appe Watch 9', fiyat=19999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=18, kategoriId=8, ad='Samsung', fiyat=10999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=19, kategoriId=9, ad='Sony 82 inch', fiyat=77999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=20, kategoriId=9, ad='Samsung 8K Ultra', fiyat=122999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=21, kategoriId=9, ad='Toshiba 42 inch fullHD', fiyat=14999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=22, kategoriId=9, ad='Samsung 3D 50 inch', fiyat=34500.0, aciklama='Yeniden', resim='null'}
 * Urun{id=23, kategoriId=10, ad='JBL ultra sound perfect', fiyat=19999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=24, kategoriId=11, ad='Sony fullHD outside', fiyat=29999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=25, kategoriId=11, ad='LG compact 1200 lümen', fiyat=14000.0, aciklama='Yeniden', resim='null'}
 * Urun{id=26, kategoriId=11, ad='Acer 720p', fiyat=4599.0, aciklama='Yeniden', resim='null'}
 * Urun{id=27, kategoriId=7, ad='Apple Watch Ultra', fiyat=39500.0, aciklama='Yeniden', resim='null'}
 * Urun{id=28, kategoriId=0, ad='MertUrunu', fiyat=99999.0, aciklama='Yeniden', resim='null'}
 * Urun{id=29, kategoriId=0, ad='Laptop i90', fiyat=0.0, aciklama='Yeniden', resim='null'}
 * Urun{id=34, kategoriId=0, ad='Laptop i90', fiyat=0.0, aciklama='null', resim='null'}
 */