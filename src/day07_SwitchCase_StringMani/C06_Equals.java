package day07_SwitchCase_StringMani;

public class C06_Equals {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3 ="java";
        String str4="JAVA";
        String str5 =new String("JaVa");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        // equals yerine == kullanılmaz Simdilik daha sonra tekrar anlatılacak
    }
}
