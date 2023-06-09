package Practice.kutuphane_Demo;

import java.util.ArrayList;

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
