package SogutucuUygulamasi;

import SogutucuUygulamasi.AnaIslemPlatformu.AgArayuzu.Arayuz;
import SogutucuUygulamasi.AnaIslemPlatformu.Eyleyici.Sogutucu;
import SogutucuUygulamasi.AnaIslemPlatformu.SicaklıkAlgilayici.CelsiusSicaklik;
import SogutucuUygulamasi.AnaIslemPlatformu.SicaklıkAlgilayici.ISicaklik;
import SogutucuUygulamasi.AnaIslemPlatformu.SicaklıkAlgilayici.KelvinSicaklik;

import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
        int choice = 0, flagAc = 0, flagKapa = 0, sicaklikTuru = 0, flagTur = 0, flagSicak=0;
        double sicak = 0.0;

        Arayuz arayuz = new Arayuz();
        ISicaklik sicaklik;
        Sogutucu sogutucu = new Sogutucu();


        if(arayuz.giris())
            do {
                choice = arayuz.menu();

                switch (choice){
                    case 1:
                        if(flagTur == 0) {
                            sicaklikTuru = arayuz.sicaklikMenusu();
                            flagTur = 1;
                        }
                            if (sicaklikTuru == 1)
                                sicaklik = new CelsiusSicaklik();

                            else
                                sicaklik = new KelvinSicaklik();
                            if(flagSicak == 0) {
                                sicak = sicaklik.sicaklikOlustur();
                                flagSicak = 1;
                            }

                        sicaklik.sicaklikBastir(sicak);
                        break;

                    case 2:
                        sogutucu.SogutucuyuAc(flagAc);
                        flagAc = 1;
                        flagKapa = 0;
                        break;

                    case 3:
                        sogutucu.SogutucuyuKapat(flagKapa);
                        flagKapa = 1;
                        flagAc = 0;
                        break;
                }
            }while(choice!=4);

        if(choice == 4)
            System.out.println("\nÇıkış yapılıyor...");

    }
}
