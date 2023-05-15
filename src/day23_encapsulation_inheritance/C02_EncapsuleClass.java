package day23_encapsulation_inheritance;

public class C02_EncapsuleClass {

    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;
    private int satisTutari;
    private int toplamSatisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari +=satisTutari;
    }

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }



    // buraya private class uyesine
    //read ve write yetkisi olan
    // 2 farkli method olusturalim

    // satis tutari baska classtan write edilebilsin
    // toplam satis tutari  baska classtan read edilebilsin



}
