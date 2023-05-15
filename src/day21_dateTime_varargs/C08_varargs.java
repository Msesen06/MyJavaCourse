package day21_dateTime_varargs;

public class C08_varargs {
    public static void main(String[] args) {
        // son elementi ayirabilecegimiz bir method olusturalim
        islemYap(2, 4, 5);


    }
    public static void islemYap(int...sayilar){
        System.out.println(sayilar[0]);
        //varargs eleman alirken sinir tanimadigi icin ne kadar eleman varsa almaya calisir
        // bu yuzden bir methodda parametre olarak varargs varsa en sonda olmalidir
        //birden fazla varargs kullanilamaz

    }
}
