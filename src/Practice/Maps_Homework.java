package Practice;

import day32_Maps.MapMethodlar;

import java.util.Map;
import java.util.Set;

public class Maps_Homework {
    public static void main(String[] args) {
        //odev
        //verilen soyisme sahip tum ogrencileri yazdirin
        //verilen subedeki tum ogrencileri yazdırın
        //verilen sınif ve subedeki tum ogrencileri yazdirin

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();
         /*


                {101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevda-Cem-12-H-TM}

          */

        System.out.println(ogrenciMap);
        //verilen soyisme sahip tum ogrencileri yazdirin
        String soyisim ="Cem";
        Set<Integer> keySet =ogrenciMap.keySet();
        int siraNo=1;
        for (Integer each:keySet
             ) {
            String value =ogrenciMap.get(each);
            String[] valueArr =value.split("-");
            if (valueArr[1].equalsIgnoreCase(soyisim)){
                System.out.println(siraNo+" "+value);
                siraNo++;
            }
        }

        System.out.println("===========================================");

        //verilen subedeki tum ogrencileri yazdırın
        siraNo=1;
        String sube ="H";
        for (Integer each:keySet
        ) {
            String value =ogrenciMap.get(each);
            String[] valueArr =value.split("-");
            if (valueArr[3].equalsIgnoreCase(sube)){
                System.out.println(siraNo+" "+value);
               siraNo++;
            }
        }

        System.out.println("===========================================");
        //verilen sınif ve subedeki tum ogrencileri yazdirin
        siraNo=1;
        for (Integer each:keySet
        ) {
            String value =ogrenciMap.get(each);
            String[] valueArr =value.split("-");
            if (valueArr[3].equalsIgnoreCase(sube) && valueArr[2].equals("11")){
                System.out.println(siraNo+" "+value);
                siraNo++;
            }
        }

    }
}
