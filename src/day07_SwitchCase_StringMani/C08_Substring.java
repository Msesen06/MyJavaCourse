package day07_SwitchCase_StringMani;

public class C08_Substring {
    public static void main(String[] args) {
        String str ="Java Candir";
        System.out.println(str.substring(5));
        System.out.println(str.substring(10));
        //System.out.println(str.substring(12));
        System.out.println(str.substring(0, 4));
        System.out.println("1.karakter :"+str.substring(1,2));
        //System.out.println(str.substring(5, 5));//hiclik
        //System.out.println(str.substring(8,5)); //hata

        String str2 ="eSRa";
        // ilk harfi buyuk diğerlerni küçük yaparak yazdırın
        str2 =str2.substring(0,1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(str2);
    }
}
