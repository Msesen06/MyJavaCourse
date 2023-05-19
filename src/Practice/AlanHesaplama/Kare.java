package Practice.AlanHesaplama;

public class Kare implements Sekiller{
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public void Alan() {
        double alan =kenar*kenar;
        System.out.println("Karenin alanı :"+ alan);

    }

    @Override
    public void Cevre() {
        double cevre =4*kenar;
        System.out.println("Karenin cevresi :"+cevre);
    }
}
