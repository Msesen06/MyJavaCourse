package day27_pollymorphism_abstractClasslar;

 public abstract class C03_Araba  {
    /*
    eger parent classta istedgimiz herhangir bir methodu child classların tumu override etmek zorunda kalsın
    istersek o methodu abstract yaaprız.
    eger abstract yapılanmethodlar tum child classlar tarafından override edilecekse
    parent classtaki  method hicbir zaman calısmayacaktır.
    override edildigi icin en gunceli kullanılacak
    o zaman abstarctın methodun body si olmaz
     */

    abstract void teker();
    abstract  void motor();
    abstract void gosterge();
    void guvenlik(){
        System.out.println("Tum arabaalrın guvenli olsa iyi olur");
    }
    void klima(){
        System.out.println("Tum arabaalrın kliması olabilir");
    }
}
