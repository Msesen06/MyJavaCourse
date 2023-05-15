package day08_StringManipulation;

public class C03_startWith_endWith {
    public static void main(String[] args) {
        String str ="Java cok eglenceli";
        System.out.println(str.startsWith("j")); //false
        System.out.println(str.startsWith("J")); //
        System.out.println(str.endsWith("li"));
        System.out.println(str.endsWith("eglenceli"));
        System.out.println(str.endsWith(str));
        System.out.println(str.length());

        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.endsWith(str.substring(str.length() - 3))); //true
    }
}
