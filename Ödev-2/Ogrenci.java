public class Ogrenci {
private String ad;
private String bolum;
private int girisyili;
private int bolumKodu;
private double gano;


    public Ogrenci(String ad, String bolum) {
        this.ad = ad;
        this.bolum = bolum;
    }

    public Ogrenci(String ad, String bolum, int girisyili, int bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisyili = girisyili;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
    }
    private int ogrNoSirasiniHesapla() {
        return 1;
    }
   public int hesaplaOgrNo() {

        String ogrNoStr = String.valueOf(girisyili) + bolumKodu + String.format("%03d", ogrNoSirasiniHesapla());
        return Integer.parseInt(ogrNoStr);
    }
    public double harcHesapla(int dersSayisi) {
       return  dersSayisi*480;
    }
    public   double harcHesapla(int dersSayisi, int uzatilanYil) {
     return harcHesapla(dersSayisi)+ (uzatilanYil*480);
    }





    public Ogrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("GANO 0 ile 4 arasında olmalıdır.");
        }
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }
}
