package day25_inheritance;

public class EBashemsire extends DHemsire{
        String gorev ="Bashemsire";
        String adres ="Adres belirtilmedi";
        EBashemsire(){
                System.out.println(adres);
                adres ="cankaya";
                System.out.println("genel gorev :" +super.gorev);
                isim="ayse";
                System.out.println(this.isim);//ayse
                System.out.println(super.isim);//ayse
                this.maas();//BAs Hemsire maası :4000
                super.maas();//Hemsire maası :2000
                nobet();//bashemsire ayda 3 gun nobet tutar.
                super.nobet();//hemsire ayda 5 gun nobet tutar.

                ozelSigorta();//hemsire ozel sigorta yaptırabilir.
                this.ozelSigorta();
                super.ozelSigorta();
                tazminat();
                this.tazminat();//bashemsire tazminat alır

        }
        public void maas(){
                System.out.println("Bas hemsire maası :" + 4000);
        }
        public void nobet(){
                System.out.println("bashemsire ayda 3 gun nobet tutar.");
        }
        public void tazminat(){
                System.out.println("bashemsire tazminat alır");
        }

        public static void main(String[] args) {
                EBashemsire bashemsire =new EBashemsire();
                System.out.println(bashemsire.adres);
                System.out.println(bashemsire.isim);

        }
}
