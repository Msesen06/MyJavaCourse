package Mayis08_OkulYonetimi;

public class Kisi {
    /*
    Öğretmen: Ad-Soyad,  kimlik No, yaş,
    Öğrenci:  Ad-Soyad,  kimlik No, yaş,
     */

    private String ad;
    private String soyad;
    private String kimlikNo;
    private int yas;

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas= " + yas +" ,";
    }

    public Kisi() {
    }

    public Kisi(String ad, String soyad, String kimlikNo, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
