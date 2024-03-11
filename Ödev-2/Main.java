public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci(),
                new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 104, 0.0),
                new Ogrenci("Ayşe", "Makine Müh", 1985, 104, 0.0),
                new Ogrenci("Elif", "Elektrik Elektronik", 2020, 104, 1.98)
        };
        int ogrSayisi = 1;
        for (Ogrenci ogr : ogrenciler) {

            System.out.println("OGR-" + ogrSayisi + "  " + ogr.getAd() + " " + ogr.getBolum() + " " + ogr.hesaplaOgrNo() + "  " + ogr.getGano());
            ogrSayisi++;

        }
        for (int i = 2; i <ogrenciler.length-1 ; i++) {
            System.out.print( i+1 +". Öğrencinin Ödeyeceği Harç :");
            System.out.println(ogrenciler[i].harcHesapla(1));
        }
        for (int i = 3; i <ogrenciler.length ; i++) {
            System.out.print( i+1 +". Öğrencinin Ödeyeceği Harç :");
            System.out.println(ogrenciler[i].harcHesapla(1,1));
        }



        }

        }











