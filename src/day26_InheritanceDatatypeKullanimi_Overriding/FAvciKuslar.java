package day26_InheritanceDatatypeKullanimi_Overriding;

public class FAvciKuslar extends EKuslar{
    public void hareket(){
        System.out.println("ucarlar");
    }
    public void beslenme(){
        System.out.println("et yerler");
    }
    public void pence(){
        System.out.println("pencelidir");
    }
    public void gaga(){
        System.out.println("sivri gagali");}

    public static void main(String[] args) {

        /*
       Asagıdaki  3 oje ayni contructor kullanmıstır
       yani 3 u de avcı kustur.
       ama data turu farklı oldugu icin farklı ozellikleri vardır
             bir obje olusturulurken eger cons ve ve data turu ayni ise
             o classa gidilir.
             aranan ozellik varsa kullanılır. yoksa parent classlara bakılır ilk bulunan Method gecerli olur.

             const ve data turu farklı ise obje cons tan olsuturulsa da ozelliklerin data turu olan
             classtaki gibi olmasını isteriz


             bir obje olusturulurken data turu cons tan farklı ise
             -aramaya data turu secilen classtan baslanır.
             ANCAK method bulununca hemen calıstırılmaz
             data turu secilen classtan constructor kullanılan classa dogru
             gider ve en guncel halini  bulup calıstırır


        */
        FAvciKuslar avciKus1 =new FAvciKuslar();

        avciKus1.cogalma();//kuslar yumurta ile
        avciKus1.beslenme();// avci kus et yerler
        avciKus1.kanat();//kuslar - kanatlari vardır
        avciKus1.omur();// hayvan -yasar ve olurler
        avciKus1.gaga();//avcı kus -sivri gagalı
        avciKus1.hareket();// avcı kuslar -ucarlar
        avciKus1.pence();// avcı kus -penceleri vardır.
        avciKus1.solunum();//kus akciger

        EKuslar avciKusgiller =new FAvciKuslar();

        avciKusgiller.cogalma();//kuslar yumurta ile
        avciKusgiller.beslenme();// avcı kus- et yerler
        avciKusgiller.kanat();//kuslar - kanatlari vardır
        avciKusgiller.omur();// hayvan -yasar ve olurler
        avciKusgiller.gaga();//avcı kus -sivri gagalı
        avciKusgiller.hareket();// avcı kuslar -ucarlar
        //avciKusgiller.pence();// method yok
        avciKusgiller.solunum();//kus akciger



        DHayvan avciHayvangiller =new FAvciKuslar();

        avciHayvangiller.cogalma();//kuslar yumurta ile
        avciHayvangiller.beslenme();// avcı kus- et yerler
        //avciHayvangiller.kanat();//hayvanda yok CTE
        avciHayvangiller.omur();// hayvan -yasar ve olurler
        //avciHayvangiller.gaga();//hayvanda yok CTE
        avciHayvangiller.hareket();// avcı kuslar -ucarlar
        //avciHayvangiller.pence();// hayvanda yok CTE
        avciHayvangiller.solunum();//kus akciger

        DHayvan hayvan1 =new DHayvan();

        hayvan1.cogalma();//hayvan cogalırlar
        hayvan1.beslenme();// beslenirler
        //hayvan1.kanat();//hayvanda yok CTE
        hayvan1.omur();// hayvan -yasar ve olurler
        //hayvan1.gaga();//hayvanda yok CTE
        hayvan1.hareket();// hayvan hareket ederler
        //hayvan1.pence();// hayvanda yok CTE
        hayvan1.solunum();//nefes alırlar


        EKuslar kus1 =new EKuslar();
        kus1.cogalma();//kuslar yumurta ile
        kus1.beslenme();// beslenirler
        kus1.kanat();//kuslar kanatları vardır
        kus1.omur();// hayvan -yasar ve olurler
        kus1.gaga();//kus gagalıdır.
        kus1.hareket();// hayvan hareket ederler
        //kus1.pence();// hayvanda yok CTE
        kus1.solunum();//kus akciger

        DHayvan kusHayvangiller =new EKuslar();
        kusHayvangiller.cogalma();//kuslar yumurta ile
        kusHayvangiller.beslenme();// hayvan beslenirler
        //kusHayvangiller.kanat();//hayvanda yok CTE
        kusHayvangiller.omur();// hayvan -yasar ve olurler
        //kusHayvangiller.gaga();//hayvanda yok CTE
        kusHayvangiller.hareket();// hayvan hareket ederler
        //kusHayvangiller.pence();// hayvanda yok CTE
        kusHayvangiller.solunum();//kus akciger



    }
}
