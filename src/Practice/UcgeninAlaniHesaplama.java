package Practice;

public class UcgeninAlaniHesaplama {
    private int kenar1;
    private int kenar2;
    private int kenar3;
    private double cevre ;
    private double ucgeniAlani;


    public UcgeninAlaniHesaplama(int kenar1, int kenar2, int kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

   public void ucgeninAlaniHesaplama(UcgeninAlaniHesaplama ucgen){
        boolean flag =true;
             cevre =(kenar1+kenar2+kenar3)/2.0;
            if (kenar1 <kenar2+kenar3 && kenar1 >Math.abs(kenar2-kenar3) ||
                kenar2 <kenar1+kenar3 && kenar2 >Math.abs(kenar1-kenar3) ||
                kenar3 <kenar1+kenar2 && kenar3 >Math.abs(kenar1-kenar2)){
                ucgeniAlani =Math.sqrt(cevre*(cevre-kenar1)*(cevre-kenar2)*(cevre-kenar3));
            } else {
                System.out.println("Verilen kenarlar uzunlukları ile ucgen olusturulamaz");
                flag =false;
            }
        if (flag) System.out.println("Kenarları verilen ucgenin alanı :"+ucgeniAlani);
    }

    public static void main(String[] args) {

         UcgeninAlaniHesaplama ucgen1 =new UcgeninAlaniHesaplama(4,3,5);
         UcgeninAlaniHesaplama ucgen2 =new UcgeninAlaniHesaplama(6,8,10);
         ucgen2.ucgeninAlaniHesaplama(ucgen2);





    }
}
