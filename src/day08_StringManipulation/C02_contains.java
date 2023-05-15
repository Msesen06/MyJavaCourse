package day08_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str ="Java ile hersey cok kolay";
        System.out.println(str.contains("ile"));
        System.out.println(str.contains("java"));

        String arananKelime ="cok";
        System.out.println("sirket ismi  var mı :"+str.contains(arananKelime));
        System.out.println(str.contains("")); // hiclik var
    }
}
