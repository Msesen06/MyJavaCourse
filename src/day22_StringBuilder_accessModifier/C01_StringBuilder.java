package day22_StringBuilder_accessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder sb ="Java";
        //non primitive data turlerinde bir data turundeki  bir degeri
        // baska bir data turune atayabilmek icin aralarında parent-child iliskisi olması lazım

        Object obj ="java";
        Object obj1=21;
        Object obj2 =true;

        // 3 farkli sekilde Stringbuilder olusturulabilir.
        // bu yontemler arasındaki fark capacity yani hafıza kullanımı ile ilgilidir
        StringBuilder sb =new StringBuilder("Java candir");
        sb.append(" candir");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // eger fazla kapasiteden kurtulmak istersek
        // length ve capacity i esitlemek istersek
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
