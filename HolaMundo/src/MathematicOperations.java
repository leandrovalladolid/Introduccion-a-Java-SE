public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //redondeo hacia arriba
        System.out.println(Math.ceil(x));
        //redondeo hacia abajo
        System.out.println(Math.floor(x));
        //Potencia
        System.out.println(Math.pow(x,y));

        System.out.println(Math.max(x,y));
        //Raíz cuadrada
        System.out.println(Math.sqrt(y));
        //Área de un círculo
        System.out.println(Math.PI * Math.pow(y,2));
        //Área de una esfera
        System.out.println(4*Math.PI*Math.pow(y,2));
        //Volumen de una esfera
        System.out.println((4/3*Math.PI*Math.pow(y,3)));
    }
}
