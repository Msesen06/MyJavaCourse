package day09_StringManipulation_ForLoop;

public class C13_ForLoopCumleyiTerstenYazdirma {
    public static void main(String[] args) {
        String str ="Java coook guzel";

        for (int i = str.length()-1; i>=0; i--) {

            System.out.print(str.substring(i,i+1));
        }
        System.out.println("\n*********************************");
       // Stringin yeni halini yenir string olarak kaydedin;
        String strYeni="";
        for (int i = str.length()-1; i>=0; i--) {

           strYeni +=str.substring(i,i+1);
        }

        System.out.println(strYeni);
    }
}
