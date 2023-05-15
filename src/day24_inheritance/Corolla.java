package day24_inheritance;

public class Corolla extends BToyota {

    String uretimYeri ="Turkiye";
    String lastik ="Corolla araclar pirelli 205-60-16 lastik kullanir";
    String model ="Corolla";
    boolean otopark=false;
    boolean cruiseControl =true;

    public void hiz(){
        System.out.println("Corolla araclar maksimum 220 km hız yapar.");
    }
    public void guvenlik(){
        System.out.println("corolla araclar 12 hava yastıgı kullanır.");
    }

    public static void main(String[] args) {
        Corolla corolla1 =new Corolla();
        System.out.println(corolla1.uretimYeri);
        corolla1.hiz();
        System.out.println(corolla1.lastik);
        System.out.println(corolla1.model);
        corolla1.guvenlik();
        System.out.println(corolla1.cruiseControl);
        System.out.println(corolla1.marka);
        System.out.println(corolla1.tekerSayisi);
    }
}
