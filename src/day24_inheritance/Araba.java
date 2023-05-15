package day24_inheritance;

public class Araba {

    String marka ="Araba markası belirtilmedi";
    String model ="Arabanın modeli olmalidir";
    int tekerSayisi =4;

    /*
    bir projede kod yazmaya baslamadan once tasarim yapılmalidir
    muhtemel classlar belirlenmeli hangisinin parent child olacagi dusunulmelidir.
    daha genel olanlar parent daha spesifik olanlar child secilmeli

    bir ozelligin variable ya da method olarak olusturmak arasinda kullanimda bir fark vardir.
    overriding konusunda anlatılacak

    araba ve toyota classları obje olusturmyacagımız sadece child classlarini organize edecegimiz
    classlardır. bunlarda main method olmsına gerek yoktur.
    (abstract class ve interface lerde islenecek)

     */
    public void hiz(){
        System.out.println("Arabalar motor ve yakıta gore maksimum hız belirler.");
    }
    public void guvenlik(){
        System.out.println("Tum arabalar guvenlik onlemleri bulundurmalıdır.");
    }
}
