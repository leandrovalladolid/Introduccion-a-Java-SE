import javax.swing.plaf.SeparatorUI;

public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];

        String days[]= new String[7];

        String[][] cities = new String[4][2]; //4*2

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
    /*
    *    System.out.println(androidVersions[0]);
    *    System.out.println(androidVersions[1]);
    *    System.out.println(androidVersions[2]);
    *    System.out.println(androidVersions[3]);
    */
        /*
        for (int i = 0; i <= androidVersions.length-1; i++) {
            System.out.println(androidVersions[i]);
        }*/

        for (String androidVersion :androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogotá";
        cities[2][0] = "Mexíco";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexíco";
        cities[3][1] = "CDMX";

//        System.out.println(cities[0][0]);
//        System.out.println(cities[0][1]);
//        System.out.println(cities[1][0]);
//        System.out.println(cities[1][1]);
//        System.out.println(cities[2][0]);
//        System.out.println(cities[2][1]);
//        System.out.println(cities[3][0]);
//        System.out.println(cities[3][1]);
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] pair : cities) {
            for (String name: pair) {
                System.out.println(name);
            }
        }
    }
}
