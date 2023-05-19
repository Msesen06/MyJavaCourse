package Practice.AlanHesaplama;

public class Ucgen implements Sekiller{

    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen(int kenar1, int kenar2, int kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    @Override
    public void Alan() {
        double u =(kenar1+kenar2+kenar3)/2.0;

        double ucgeninAlani =Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Ucgenin alanı :"+ucgeninAlani);
    }

    @Override
    public void Cevre() {
        System.out.println("Ucgenin cevresi :"+(kenar1+kenar2+kenar3));
    }
}
