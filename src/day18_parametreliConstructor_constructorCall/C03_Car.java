package day18_parametreliConstructor_constructorCall;

public class C03_Car {
    String marka ="Marka Belirtilmedi";
    String model ="Model belirtilmedi";
    int yil;
    int fiyat;

    public C03_Car(int fyt,String mrk){
        fiyat=fyt;
        marka=mrk;

    }

    public C03_Car(String mrk){
        marka="Bmw";
        //fiyat=14000;
        //model="5.20";
        //yil=2000;
    }

    public C03_Car(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public C03_Car(){

    }

    @Override
    public String toString() {
        return "C03_Car==>" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
