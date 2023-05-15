package Mayis08_OkulYonetimi;

public class Ogrenci extends Kisi{
    /*
     Öğrenci:  Ad-Soyad,  kimlik No, yaş,numara, sınıf
     */

    private int numara;
    private String sinif;

    public Ogrenci() {
    }

    public Ogrenci(int numara, String sinif) {
        this.numara = numara;
        this.sinif = sinif;
    }

    public Ogrenci(String ad, String soyad, String kimlikNo, int yas, int numara, String sinif) {
        super(ad, soyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci ="+super.toString()+
                "numara=" + numara +
                ", sinif=" + sinif;
    }
}
