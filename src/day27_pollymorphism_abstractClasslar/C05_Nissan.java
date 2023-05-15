package day27_pollymorphism_abstractClasslar;

public class C05_Nissan extends C03_Araba {
    /*
    abstract class lar yokken classlarımıza isim vermemistik
    ancak abstract class devreye giridiginde
    abstract olmayan yani somut concrete class

     */
    @Override
    void teker() {
        System.out.println("Nissan araclar lassa kullanır");
    }

    @Override
    void motor() {
        System.out.println("nissan araclar renault motor kullanır");
    }

    @Override
    void gosterge() {
        System.out.println("nissan araclarda 20 tane gosterge vardır");
    }

    public static void main(String[] args) {
        C05_Nissan nissan1= new C05_Nissan();
        nissan1.gosterge();// 20 tane gosterge
        nissan1.klima();//parent
        nissan1.motor();// renault motor
        nissan1.teker();//lass
        nissan1.guvenlik();//parent

        C03_Araba nissan2=new C05_Nissan();
        nissan2.gosterge();// 20 tane gosterge
        nissan2.klima();//parent
        nissan2.motor();// renault motor
        nissan2.teker();//lass
        nissan2.guvenlik();//parent
    }
}
