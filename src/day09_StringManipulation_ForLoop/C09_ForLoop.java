package day09_StringManipulation_ForLoop;

public class C09_ForLoop {
    public static void main(String[] args) {
        // Soru verilen bir metindeki
        //buyuk harf kücuk harf ve space sayısını bulun
        //space sayısını gozonunde bulundurarak kac kelime oldugu bulun
        //kac tane kucuk ve buyuk harf oldugunu yazdırın
        String str="Java ogrenen isi kapar";
        int kucukHarfSayisi=0;
        int buyukHarfSayisi=0;
        int spaceSayisi=0;

        for (int i = 0; i < str.length(); i++) {
            char karakter =str.charAt(i);
            if (karakter>='a' && karakter<='z'){
                kucukHarfSayisi++;
            } else if (karakter<='Z' && karakter>='A') {
                buyukHarfSayisi++;
            } else if (karakter==' ') {
                spaceSayisi++;
            }

        }
        System.out.println("Metindeki sayısı :"+(spaceSayisi+1)+
                "\nkucuk harf sayisi :"+kucukHarfSayisi +
                "\nbuyuk harf sayisi :"+buyukHarfSayisi);





    }
}
