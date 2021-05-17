package SogutucuUygulamasi.AnaIslemPlatformu.AgArayuzu;

import SogutucuUygulamasi.Kullanici;
import SogutucuUygulamasi.Veritabani;


import java.util.Scanner;

public class Arayuz implements IArayuz
{
    Scanner input = new Scanner(System.in);

    public boolean giris() {

        System.out.println("KULLANICI GİRİŞ ARAYÜZÜ");

        Veritabani veritabani = new Veritabani();

        System.out.println("Kullanıcı Adı ve Parola giriniz:");

        System.out.print("Kullanıcı Adı: ");
        String isim = input.next();

        System.out.print("Şifre: ");
        String sifre = input.next();

        Kullanici kisi = new Kullanici.Builder().set(isim, sifre).build();

        return veritabani.authorization(kisi.getIsim(), kisi.getSifre());
    }


    public int menu() {

        System.out.println("");
        System.out.println("\t\tMENU\n-------------------------");
        System.out.println("1.Sıcaklığı Göster\n2.Soğutucuyu Aç\n3.Soğutucuyu Kapat\n4.Çıkış");
        System.out.print("Seçim:");

        int choice = input.nextInt();

        return choice;
    }

    public int  sicaklikMenusu(){
        System.out.println("\nSıcaklık türünü seçiniz\n----------------------");
        System.out.print("1. Celsius\n2. Kelvin\nSeçim: ");
        Scanner sicaklikTuruInput = new Scanner(System.in);

        int sicaklikTuru = sicaklikTuruInput.nextInt();

        return sicaklikTuru;

    }

}
