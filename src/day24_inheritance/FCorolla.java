package day24_inheritance;

public class FCorolla extends  EToyota{
        String uretimYeri ="Turkiye";
        String model="Corolla";
        FCorolla(){
            System.out.println("Corolla constructor calıstı.");
        }
    public static void main(String[] args) {

        FCorolla corolla =new FCorolla();
        System.out.println(corolla.motor);
        System.out.println(corolla.marka);
        System.out.println(corolla.model);

        System.out.println(corolla.uretimYeri);

        /*
         bir obje olusturuldugunda
         constructor calısir ve class level variableların
         bir kopyası objeye ilisiklendirilir.

         bir classta gorunur constructor yoksa default vardir

         java inheritance da obje olusturuldugunda
         parent classlardaki constructorlarin da
         calısması icin bir mekanizma bulunur.
         extends keyword kullanılan bir
         child classta var olan bir gorunur constructorda
         ilk satırda gorunur bir constructor call
         yoksa  gorunmeyen bir super() constructor call vardır.
         super() : parent classtaki parametresiz
         constructor call



         */

    }
}
