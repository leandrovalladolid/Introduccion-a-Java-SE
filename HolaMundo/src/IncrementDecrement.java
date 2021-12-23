public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        lives --; //Decremento
        System.out.println(lives);

        lives++; //ncremento
        System.out.println(lives);

        //Prefija
        //Gana un premio por ganar una vida
        int gift = 100 + lives++; //postfijo
        int gifts = 100 + ++lives; //prefijo
        System.out.println(gift);
        System.out.println(gifts);
        System.out.println(lives);


    }
}
