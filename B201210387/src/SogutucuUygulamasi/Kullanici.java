package SogutucuUygulamasi;

public class Kullanici {

    private String isim;
    private String sifre;


    public String getIsim() {
        return isim;
    }

    public void SetIsim(String username) {
        isim = username;
    }

    public String getSifre() {
        return sifre;
    }

    public void SetSifre(String password) {
        sifre = password;
    }



    public static class Builder
    {
        private String isim;
        private String sifre;

        public Builder(){}

        public Builder set(String isim, String sifre)
        {
            this.isim = isim;
            this.sifre = sifre;
            return this;
        }

        public Kullanici build()
        {
            return new Kullanici(this);
        }
    }

    Kullanici(Builder builder)
    {
        this.isim = builder.isim;
        this.sifre = builder.sifre;
    }

}
