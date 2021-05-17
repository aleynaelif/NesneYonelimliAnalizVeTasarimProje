package SogutucuUygulamasi.AnaIslemPlatformu.Eyleyici;

public class Sogutucu implements ISogutucu{
    public void SogutucuyuAc(int flag){

        if(flag == 0)
            System.out.println("Soğutucu başarıyla açıldı.");
        else
            System.out.println("Soğutucu açık.");
    }

    public void SogutucuyuKapat(int flag){

        if(flag == 0)
            System.out.println("Soğutucu başarıyla kapatıldı.");
        else
            System.out.println("Soğutucu kapalı.");

    }
}
