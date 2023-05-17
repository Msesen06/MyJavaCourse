package Practice;

public class C01Alistirmalar_StringMani {
    public static void main(String[] args) {
        String str ="  J&/&&&%&%&%%^^^+^+{     {½$½$$#$#$#6765a4574v548a54994½$½c$½$a7878n9d8i98&r    ";
        System.out.println(str.replaceAll("\\W",""));
        str  =str.replaceAll("\\d","");
        System.out.println("rakamsız :".concat(str));
        str =str.trim();
        System.out.println("bastaki bosluksuz :"+ str);
        str =str.replaceAll("\\W","");
        System.out.println("sadece harf :"+str);
        String str1="Java candir kardes";
        String[] spl =str1.split(" ");
        for (String kelime:spl) {
            System.out.println(kelime);
        }

    }
}
