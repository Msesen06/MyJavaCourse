package day26_InheritanceDatatypeKullanimi_Overriding;

public class CAvciKuslar extends BKuslar{
    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {
        CAvciKuslar avci1 =new CAvciKuslar();

        System.out.println(avci1.beslenme);//et
        System.out.println(avci1.gaga);//sivri
        System.out.println(avci1.cogalma);//yumurta
        System.out.println(avci1.kanat);// kanatlıdır.
        System.out.println(avci1.hareket);//ucarlar.
        System.out.println(avci1.pence);//pencelidir.
        System.out.println(avci1.solunum);//akcigerle nefes alırlar
        System.out.println(avci1.omur);//yasar ve olurler


        BKuslar avciKusgiller =new CAvciKuslar();
        //avcı kus is a kus
        System.out.println(avciKusgiller.beslenme);//hayvan beslenirler
        System.out.println(avciKusgiller.gaga);//kuslar gagalari vardır
        System.out.println(avciKusgiller.cogalma);// kuslar yumurta
        System.out.println(avciKusgiller.kanat);// kuslar kanatlıdır.
        System.out.println(avciKusgiller.hareket);//hayvan hareket ederler
        //System.out.println(avciKusgiller.pence);//pencelidir.
        System.out.println(avciKusgiller.solunum);//akcigerle nefes alırlar
        System.out.println(avciKusgiller.omur);//hayvan yasar ve olurler




        AHayvan avciHayvangiller=new CAvciKuslar();
        //avcı kus is a hayvan
        System.out.println(avciHayvangiller.beslenme);//hayvan -beslenirler
        //System.out.println(avciHayvangiller.gaga);//kuslar -gagalari vardır
        System.out.println(avciHayvangiller.cogalma);// hayvan -cogalırlar
        //System.out.println(avciHayvangiller.kanat);// kuslar- kanatlıdır.
        System.out.println(avciHayvangiller.hareket);//hayvan -hareket ederler
        //System.out.println(avciHayvangiller.pence);//pencelidir.
        System.out.println(avciHayvangiller.solunum);//hayvan -nefes alırlar
        System.out.println(avciHayvangiller.omur);//hayvan -yasar ve olurler



       /*
       Asagıdaki  3 oje ayni contructor kullanmıstır
       yani 3 u de avcı kustur.
       ama data turu farklı oldugu icin farklı ozellikleri vardır
             bir obje olusturulurken eger cons ve ve data turu ayni ise
             o classa gidilir.
             aranan ozellik varsa kullanılır. yoksa parent classlara bakılır ilk bulunan variable gecerli olur.

             const ve data turu farklı ise obje cons tan olsuturulsa da ozelliklerin data turu olan
             classtaki gibi olmasını isteriz


             bir obje olusturulurken data turu cons tan farklı ise tum variableları data turu olan classa
             gore dusunmeliyiz

        */

    }
}
