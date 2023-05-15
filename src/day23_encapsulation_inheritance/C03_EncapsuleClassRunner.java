package day23_encapsulation_inheritance;

public class C03_EncapsuleClassRunner {

    public static void main(String[] args) {
        C02_EncapsuleClass obj =new C02_EncapsuleClass();
       obj.defaultStr="default str";
       obj.protectedStr ="protected str";
       obj.publicStr ="public str";
        System.out.println(obj.getToplamSatisTutari());
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);
        System.out.println(obj.getToplamSatisTutari());


       /*
       encapsulationun  temel amacı read ve write
       yetkilerini ayirmak ve istedigimiz class uyesine
       read istedimiz class uyesine write yetkisi
       verebilmektir.
        access modifieri default, protected ve public olan
        olanlarda read/write yetkilerini ayrımamız mumkun degil.

        access modifieri private olan class uyelerine ise
        ulasamayız.
        bunu firsata cevirelim.

        normal yollarla private olan class uyesine erisilemez
        ama o class uyesine erisebilecek
        ve  yetkisi sinirli olan methodlar olusturulabilir.
        */
    }

}
