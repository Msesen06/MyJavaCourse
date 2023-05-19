package Practice.AlanHesaplama;

public class Daire implements Sekiller{
    private double yaricap ;
    @Override
    public void Alan() {
        double alan =Math.PI*yaricap*yaricap;
        System.out.println("Dairenin alanı :" +alan);
    }

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void Cevre() {
            double cevre =2*Math.PI*yaricap;
        System.out.println("Cemberin cevresi :" +cevre);
    }
}
