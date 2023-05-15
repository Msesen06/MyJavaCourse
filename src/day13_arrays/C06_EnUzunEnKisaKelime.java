package day13_arrays;

public class C06_EnUzunEnKisaKelime {
    public static void main(String[] args) {
        //verilen string bir arrayde en uzun ve en kisa kelimeleri yaziran bir method olusturun

        String[] arr ={"Saida","Isa","Asil","Kubra Kaya","Elif"};
        EnUzunEnKisaKelime(arr);
    }

    private static void EnUzunEnKisaKelime(String[] arr1 ) {
        String enKisa =arr1[0];
        String enUzun =arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (enKisa.length()<arr1[i].length()){
                enKisa =arr1[i];
            }
            if (enUzun.length()>arr1[i].length()){
                enUzun=arr1[i];
            }
        }
        System.out.println("dizideki en kisa elementin uzunlugu :"+enKisa+
                           "\ndizideki en uzun elementin uzunlugu :"+enUzun );

    }
}
