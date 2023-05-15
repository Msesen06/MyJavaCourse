package day22_StringBuilder_accessModifier;

public class C05_AccessModifier {
    public C05_AccessModifier (){

    }
    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;
    private static int privateStaticSayi;
    static int defaulStatictSayi ;
    protected static int protectedStaticSayi;
    public static int publicStaticSayi;

    private void privateMethod(){

    }
    void defaultMethod(){

    }

    protected void protectedMethod(){

    }
    public void publicMethod(){
        System.out.println("public method");
    }

    private static void privatestaticMethod(){

    }
    static void defaultStaticMethod(){

    }

    protected static void protectedStaticMethod(){

    }
    public static void publicStaticMethod(){

    }

    public static void main(String[] args) {
        protectedStaticSayi=0;
        C05_AccessModifier obj =new C05_AccessModifier();
        obj.publicMethod();

    }

}
