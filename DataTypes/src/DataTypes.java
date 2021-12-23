public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        //Se coloca la L al final para que sea long
        long nL=12345678901L;

        double nD=123.4567890123;
        //Se coloca la F al final para que sea float
        float nf=123.4567890123F;

        //A partir de Java 10 no es necesario ingresar el tipo de variable

        var salary = 1000;
        var bono = salary*0.03;
        var total = salary + bono;
        System.out.println(total);

        var cadena = "first name";

    }
}
