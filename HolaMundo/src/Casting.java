public class Casting {
    public static void main(String[] args) {
        double x = 30.0/12.0;

        System.out.println(x);

        //Estimación
        int e = (int) x;
        System.out.println(e);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        char n = '@';
        int nI = n;
        System.out.println(nI);

        short ns = (short) n;
        System.out.println(ns);
    }
}
