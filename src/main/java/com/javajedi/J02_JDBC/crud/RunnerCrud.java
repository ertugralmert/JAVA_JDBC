package com.javajedi.J02_JDBC.crud;

import java.sql.SQLException;

public class RunnerCrud {
    // CRUD sınıfında tüm methodları yazdık Runner sınıfında yazdığımız kodlara şimdi bakın.
    // aşağıdaki methodda 1 satır ile ilgili ürünü ekleyebliyoruz.
    public static void main(String[] args) throws SQLException {
        CRUD crud = new CRUD ("SatisDB");
        crud.executeUpdate("insert into tblurun(ad) values ('Laptop i90')");
        /**
         * > Task :RunnerCrud.main()
         * Başarılı
         */
    }
}
