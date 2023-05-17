package day31_iterators_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        //double ended queue
        //genel olraka queue ozelliklerini gosterir.
        //ancak bastan ve sondan ekleme cıkarma ozellikleri var

        Deque<String> deq =new LinkedList<>();

        deq.add("Adnan");
        deq.addLast("Sevda");
        deq.addFirst("Saida");
        System.out.println(deq);
        System.out.println(deq.removeLastOccurrence("Sevda"));
        System.out.println(deq);
        //tek sevda oldugu icin removeLastOccurrence("Sevda") ,remove(), arasında fark yok

        System.out.println(deq.pop());//ilk elementi siler ve bize dondurur
        System.out.println(deq);
        Deque<String> bosDeq=new LinkedList<>();
        //System.out.println(bosDeq.removeFirst());NoSuchElementException
        //System.out.println(bosDeq.pop());NoSuchElementException


    }
}
