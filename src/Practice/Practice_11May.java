package Practice;

public class Practice_11May {
    public static void main(String[] args) {
            // create 2D array of food:

            // print all the foods sorted

            /*

            steak

            hot dog

            cheeseburger

            -----------------------

            pizza

            pasta

            canoli

            -----------------------

            sushi

            ramen

            fried rice

            dumplings

            -----------------------

            kebab

            manto

            -----------------------

            beriyani

            masal

            curry

            chicken tikka masala

            -----------------------

            */

        String[][] food={{"steak", "hot dog","cheeseburger"},{"pizza","pasta","canoli"},{"sushi","ramen","fried rice","dumplings"},
            {"kebab", "manto"},
            {"beriyani","masal","curry","chicken tikka masala"}};
        String[] ulkeler ={"American","Italian","Korean","Afghani","Indian"};

        for (String[] each: food
             ) {
            for (String yemek: each
                 ) {
                System.out.println(yemek);
            }
            System.out.println("-----------------------");
        }

        System.out.println("------------------For i Cozumu---------------------");
        System.out.println("\n\n\n");
        for (int i = 0; i < food.length; i++) {
            System.out.println("------------------"+ulkeler[i]+"-------------------");

            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }

        }
    }
}
