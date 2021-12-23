public class Funciones {
    /*
    * Comentario multilinea
    *
    * */

    /** */
    public static void main(String[] args) {
        double x = 2.1;

        //Área del círculo
        double area = circleArea(x);
        System.out.println(area);

        System.out.println("##############");
        System.out.println("Pesos a dólares -> "+converToDolar(1000,"COP"));
    }


    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dólares
     * */
    public static double converToDolar (double quantity, String currency){
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
