package day23_encapsulation_inheritance;

import day22_StringBuilder_accessModifier.C05_AccessModifier;

public class C01_AccesModifierKullanim extends  C05_AccessModifier{
    public static void main(String[] args) {
        C05_AccessModifier.publicStaticSayi=2;

        // baska package den sadece pulic
        // olanlari cagirabliriz
        //eger bulundugumuz class ile ulasmak
        // istegimiz class arasında parent-child
        // iliskisi varsa ulasabiliriz

        // C05 classını extend ettgimiz icin protected olan method ve variablelara ulasabliriz.
        C05_AccessModifier.protectedStaticSayi=3;
        C05_AccessModifier obj =new C05_AccessModifier();
        obj.publicStr="java";
    }
}
