public class UpdtingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //Bono de 200;
        salary = salary+200;
        System.out.println(salary);
        //Descuento de 50 por pensión
        salary = salary - 50;
        System.out.println(salary);
        //2 horas extra, 30 cu
        //Comida: -45
        salary = salary + (30*2) -45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employedName = "Nombre";
        employedName = employedName + " Apellidos";
        System.out.println(employedName);
    }
}
