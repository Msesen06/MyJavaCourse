package day23_encapsulation_inheritance;

public class C05_EncapsuleClassRunner {
    public static void main(String[] args) {

        C04_EncapsuleClass obj =new C04_EncapsuleClass();
        obj.publicStr="java candir";
        obj.setPrivateStr("hersey dusunulmus");
        System.out.println(obj.getPrivateStr());
        /*
        bir class uyesini private yapıp hem getter
        hem setter methodu olusturmak ile
        o class uyesini public yapmak arasında
        islevsel acısından bir fark yoktur.

        bazı developerlar public yapmak yerine
        private yapıp setter ve getter yaparak
        read ve write yetkisi verilir.
         */

    }
}
