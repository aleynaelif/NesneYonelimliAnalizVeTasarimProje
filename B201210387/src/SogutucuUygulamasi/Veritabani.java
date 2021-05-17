package SogutucuUygulamasi;

import java.sql.*;

public class Veritabani {
    public boolean authorization (String username, String password) {

        try {

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/deneme",
                    "postgres", "Aleyna");

            if (conn != null)
                System.out.println("Veritabanına bağlandı.");
            else
                System.out.println("Bağlantı girişimi başarısız!");

            String sql = "SELECT *  FROM \"kullanicilar\" WHERE \"isim\"='" + username
                    + "' and \"sifre\"='" + password + "'";

            assert conn != null;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            if (!rs.next()) { // Veritabanından dönen ResultSet boş ise böyle bir kullanıcı yoktur
                System.out.println("Böyle bir kullanıcı bulunamadı.");
                rs.close();
                stmt.close();
                return false;
            }

            else { // ResultSet boş değilse giriş başarılıdır
                System.out.println("Giriş başarılı.");
                rs.close();
                stmt.close();
                return true;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
