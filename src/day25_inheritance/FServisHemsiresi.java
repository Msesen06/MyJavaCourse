package day25_inheritance;

public class FServisHemsiresi extends DHemsire{
    String str ="servis hemsiresi";
    int numara =20;
    public static void main(String[] args) {
        FServisHemsiresi servisHemsiresi =new FServisHemsiresi();
        servisHemsiresi.staticOlmayanMethod();
    }
    public void nobet(){
        System.out.println("servis hemsiresi ayda 10 gun nobet tutar.");
    }
    public void calismaGunu(){
        System.out.println("servis hemsiresi haftada 4 gun calısır.");
    }
    public void staticOlmayanMethod(){
        nobet();
        this.nobet();
        super.nobet();
        maas();//aynı
        this.maas();
        super.maas();//Hemsire maası :2000
        calismaGunu();
        this.calismaGunu();//servis hemsiresi haftada 4 gun calısır.
        String str ="method";
        System.out.println(str);//method
        System.out.println(this.str);//servis hemsiresi
        System.out.println(super.str);//hemsire
        System.out.println(numara);
        System.out.println(this.numara);
        System.out.println(super.numara);
    }
}
