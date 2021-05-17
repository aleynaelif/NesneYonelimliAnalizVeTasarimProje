package SogutucuUygulamasi.AnaIslemPlatformu.SicaklıkAlgilayici;

import java.text.DecimalFormat;
import java.util.Random;


public class CelsiusSicaklik implements ISicaklik {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    public double sicaklikOlustur() {
        double min = -30.0, max = 50.0;
        double randomValue = 0.0;

        Random rand = new Random();
        randomValue = min + (max - min) * rand.nextDouble();

        return randomValue;
    }


    @Override
    public void sicaklikBastir(double sicaklik) {


        System.out.println("Sıcaklık: " + df2.format(sicaklik) + " °C");
    }


}
