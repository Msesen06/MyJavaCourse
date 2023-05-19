package Practice.AlanHesaplama;

public class Runner {
    public static void main(String[] args) {
        Ucgen ucgen =new Ucgen(3,4,5);
        ucgen.Alan();
        ucgen.Cevre();
        Kare kare =new Kare(6);
        kare.Alan();
        kare.Cevre();

        Daire daire =new Daire(8);
        daire.Alan();
        daire.Cevre();
    }
}
