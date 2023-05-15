package day07_SwitchCase_StringMani;

public class C07_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3 ="java";
        String str4="JAVA";
        String str5 =new String("JaVa");
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str5));
    }
}
