package day08_StringManipulation;

public class C07_isEmpty_isBlank {
    public static void main(String[] args) {
        String str ="Java candir";
        String str2="    ";

        System.out.println(str.isEmpty()); //tamamen bos false
        System.out.println(str.isBlank());//space false
        System.out.println(str2.isBlank());//true
        System.out.println(str2.isEmpty()); //false
    }
}
