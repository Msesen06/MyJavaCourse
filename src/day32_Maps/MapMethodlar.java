package day32_Maps;

import java.security.KeyStore;
import java.util.*;

public class MapMethodlar {
    //bu methodda static methodlar olusturalım. heryerden ulasabilelim


    public static  String numaraIleOgrenciBulma(Map map, int numara){

        String valueBilgiler = (String) map.get(numara);

        String[] valueArray =valueBilgiler.split("-");
        String ad =valueArray[0];
        String soyad =valueArray[1];

        ad =ad.toUpperCase().charAt(0)+ad.substring(1).toLowerCase();
        soyad =soyad.toUpperCase().charAt(0)+soyad.substring(1).toLowerCase();
        String uygunFormat = ad+" "+soyad;

        return uygunFormat;


    }

    public static Map<Integer, String> ogrenciMapOlustur(){
        Map<Integer, String> ogrenciMap =new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(105,"Sevda-Cem-11-H-TM");


        return ogrenciMap;
    }

    public static void tumOgrencileriYazdir(Map<Integer, String> ogrenciMap){
        //tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdıran bir method olusurturun
         Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();//[101, 102, 103, 104, 105]
         // tum keyleri ele alıp o keye ait ad ve soyadı yukarıdak i methodu kullnarak yazdıralım

        int siraNo =1;
        for (Integer eachKey:ogrenciKeySeti
             ) {
            System.out.println(siraNo+" "+numaraIleOgrenciBulma(ogrenciMap, eachKey));
            siraNo++;
        }


    }

    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {
        //istenen sınıftaki tum ogrencilerin isim ve soyisimlerini yazdırın

        //valueları kaydedelim

        Collection<String> valueCollection =ogrenciMap.values();
        int siraNo =1;
        for (String eachValue: valueCollection
             ) {
            //herbir value yi split edip class bilgisini kontrol etmemiz gerekir

            String[] eachValueArr =eachValue.split("-");

            //arraydan sinif bilgisini kontrol edip istenen sinif degerine
            //esit ise isim ve soy isim degerlerini yazdıralım

            if (eachValueArr[2].equals(sinif+"")){
                System.out.println(siraNo+"- " +eachValueArr[0]+" "+eachValueArr[1]+" "+eachValueArr[2]);
                siraNo++;

            }
        }

    }

    public static void numaraAraligindakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        //ogrenci numarası verilen iki deger arasında olan sınırlar dahil tum ogrencilerin
        //numara isim ve soyisim ve bolumlerini yazdirin

        if (basNo==bitNo ||basNo>bitNo){
            System.out.println("dogru deger girilmedi");
        }
        //ogrencileri numaralarına gore kontrol etmek icin tum keyleri alalım
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();//[101, 102, 103, 104, 105]

        int siraNo=1;
        for (Integer eachKey:ogrenciKeySeti
             ) {
            if (basNo<=eachKey && eachKey<= bitNo){
                //istenen aralıktaki  key'ler buraya
                //burada o keye ait isim soy isim ve bolume ulasmalıyım

                String value =ogrenciMap.get(eachKey);

                String[] valueArr=value.split("-");

                System.out.println(siraNo +"- "+eachKey +" "+
                        valueArr[0]+" "+
                        valueArr[1]+" "+
                        valueArr[4]);

                siraNo++;
            }
        }


    }

    public static Map<Integer, String> numaraileUpdateEt(Map<Integer, String> ogrenciMap, int numara, String yeniSoyad) {
        //numarası verilen ogrencinin soyisimini yeni verilen deger ile update edin
        //ogrencinin valuesini  kaydet 102=Veli-Cem-10-K-TM,

        String value =ogrenciMap.get(numara);

        //sonra split ile ayırmalıyız.[Veli,Cem,10,K,TM]
        String[] valueArr =value.split("-");

        // bu arrayda soy isim olarak yeni soy ismi atayabiliriz.[Veli,Han,10,K,TM]
        valueArr[1]=yeniSoyad;
        //bu arraydaki  guncel bilgileri value yapısına uygun olarak yeniden birlestirmeliyiz.
        value =valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[3]+"-"+valueArr[4];

        ogrenciMap.put(numara,value);//keyler unique oldugu icin aynı seyi iki defa eklemez
        //eskisini siler yenisini ekler.

        //ogrenciyi yeni valuesu ile map ekleyelim.

        return ogrenciMap;
    }

    public static void numaraliTumOgrencileriYazdir(Map<Integer, String> ogrenciMap) {
        //ogrenci listesini numara-isim-soy isim-sınıf seklinde yazdırın
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
       //[101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
       // 104=Ayse-Can-10-H-MF, 105=Sevda-Cem-11-H-TM]

       //bu sekilde tek for each ile hem key hem de valueye ulasbilecegiz.
        System.out.println(ogrenciEntrySeti);

        System.out.println("No      Isim    Soyisim     Sınıf");
        System.out.println("----------------------------------");

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            String ogrenciValuesi =eachEntry.getValue();//101=Ali-Can-11-H-MF
            String[] ogrenciValuearr =ogrenciValuesi.split("-");//[Ali, Can ,11, H ,MF]

            System.out.println(eachEntry.getKey()+"\t"+ogrenciValuearr[0]+"\t"+
            ogrenciValuearr[1]+"\t"+ogrenciValuearr[2]);

        }
     /*
    101=Ali-Can-11-H-MF
    102=Veli-Cem-10-K-TM
    103=Ali-Cem-11-K-TM
    104=Ayse-Can-10-H-MF
    105=Sevda-Cem-11-H-TM
      */
    }

    public static Map<Integer, String> yilsonuSinifArttir(Map<Integer, String> ogrenciMap) {
        //tum entryleri ele almak icin etry set olusturalım
        Set<Map.Entry<Integer,String>> ogrenciEntrySet =ogrenciMap.entrySet();

        //her bir entry yi ele alıp isteneni update edelim

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
             ) {
            //sinifi update edebilmek icin once value yu parcalayı istenen bilgiye ulasalım
           String eachValue = eachEntry.getValue();//Ali-Can-11-H-MF
           String[] eachValueArr=eachValue.split("-");//[Ali, Can ,11, H ,MF]
            //arrayde ikinci indexteki sinif bilgini inceleyip gerekli update i yapalım.
            if (!eachValueArr[2].equalsIgnoreCase("Mezun")){
                Integer sinif =Integer.parseInt(eachValueArr[2]);

                if (sinif<12){
                    sinif++;
                    eachValueArr[2]=""+sinif;
                }else {
                    eachValueArr[2]="Mezun";
                }
            }
            //bilgi update edildikten sonra arrayde yapılan degisikligin mape islenmesi icin
            //herbir entryi update edelim.

            eachEntry.setValue(eachValueArr[0]+"-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"+
                    eachValueArr[3]+"-"+eachValueArr[4]);
        }

        return ogrenciMap;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        //ogrenci mapindeki ogrencilerin soyisimlerini buyuk harfe cevirelim
        Set<Map.Entry<Integer,String>> ogrenciEntrySet =ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySet
             ) {
            String ogrenciValue =eachEntry.getValue();

            String[] eachValueArr =ogrenciValue.split("-");

            eachValueArr[1]=eachValueArr[1].toUpperCase();

            eachEntry.setValue(eachValueArr[0]+"-"+eachValueArr[1]+"-"+eachValueArr[2]+"-"+
            eachValueArr[3]+"-"+eachValueArr[4]);

        }
        return ogrenciMap;
    }
}

