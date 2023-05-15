package day19_StaticKeyword_PassbyValue;

public class C04_staticOlmayanBlok {
    public static void main(String[] args) {
        System.out.println("main method calisti");

        C04_staticOlmayanBlok obj1 =new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj2 =new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj3 =new C04_staticOlmayanBlok();
    }
    static {
        System.out.println("static blok calisti");
    }
    {

        // static olmayan bloklar objeye baglidir ve her obje olusturuldugunda calisir
        // obje sayisinca calisir, static  blok classa baglidir ve bir kere calisir.

        //obje olusturuldugunda constructor icinde yapmak istemedigimiz ama obje icin
        // ihtiyac duydugumuz bir islem varsa static olmayan blok kullanilabilir.
        System.out.println("static olmayan blok calisti");
    }

}
