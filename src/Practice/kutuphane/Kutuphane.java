package Practice.kutuphane;

import java.util.ArrayList;
import java.util.Scanner;

public class Kutuphane {
    private ArrayList<Kitap> kitaplar;

    public Kutuphane(){
        kitaplar =new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap){
        kitaplar.add(kitap);
    }
    public void kitapCikar(Kitap kitap){
        kitaplar.remove(kitap);
    }

    public ArrayList<Kitap> getKitaplar() {
        return kitaplar;
    }
}
