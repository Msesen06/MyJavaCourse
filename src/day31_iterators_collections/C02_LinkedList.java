package day31_iterators_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
        List<String> liste =new LinkedList<>();
        System.out.println("bos liste hashcode :" +liste.hashCode());
        liste.add("Esat");
        liste.add("Sevda");
        liste.add("İlknur");
        liste.add("Seyma");
        System.out.println(liste);
        liste.add(2,"Nurhayat");
        System.out.println(liste);//[Esat, Sevda, Nurhayat, İlknur, Seyma]
        System.out.println("5 elementten sonra hashcode :" +liste.hashCode());

        List<String> liste2=new LinkedList<>();
        liste2.add("Yusuf");
        liste2.add("Esat");
        liste2.add("İlknur");
        liste2.add("Murat");
        System.out.println(liste2);
        System.out.println(liste.retainAll(liste2));
        System.out.println(liste); //[Esat, İlknur] ortak elemanlar kalır.

    }
}
