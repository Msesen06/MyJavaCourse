package Practice;

public class ikidenFazlaOlaniKaldir {
    public static void main(String[] args) {
        int[] dizi ={1,1,1,3,3,4,4,4,4,5,6,6};
        System.out.println(tekrariKaldir(dizi));
    }
    public static int tekrariKaldir(int[] dizi) {

        int index =1;
        int sayac =1;

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i]==dizi[i-1]){
                sayac++;
            }else {
                sayac=1;
            }
            if (sayac<=2){
                dizi[index]=dizi[i];
                index++;
            }
        }
        return index;
    }
}
