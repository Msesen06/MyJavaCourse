package Mayis08_OkulYonetimi;

public class Ogretmen extends Kisi{
    //Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No
    private String bolum ;
    private int sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String bolum, int sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String ad, String soyad, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(ad, soyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "ogretmen =" +super.toString()+
                "bolum= " + bolum + '\'' +
                ", sicilNo=" + sicilNo;
    }
}
