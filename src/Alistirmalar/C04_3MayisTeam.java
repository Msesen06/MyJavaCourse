package Alistirmalar;

public class C04_3MayisTeam {
    public static void main(String[] args) {
        //verilen bir arraydeki elementlerin geometrik ortalamsını veren bir method olusturun

        int [] dizi ={2,4,8,12};
        int toplam =toplamiHesapla(dizi);
        int carpim =carpimHesapla(dizi);
        System.out.println(Math.pow(carpim, 1.0/ dizi.length));
    }

    public static int toplamiHesapla(int[] dizi) {
        int toplam =0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }

        return toplam;
    }
    public static int carpimHesapla(int[] dizi){
        int carpim =1;
        for (int i = 0; i < dizi.length; i++) {
            carpim*=dizi[i];
        }
        return carpim;
    }

}
