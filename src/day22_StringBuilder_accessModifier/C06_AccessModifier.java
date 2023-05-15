package day22_StringBuilder_accessModifier;

public class C06_AccessModifier {
    public static void main(String[] args) {
        C05_AccessModifier.defaulStatictSayi=2;

        C05_AccessModifier obj =new C05_AccessModifier();
        obj.protectedStr="java";
        // static variable ve methodlara class ismi ile ulasbilriz
        // private olanlara ulasmayız.

    }
}
