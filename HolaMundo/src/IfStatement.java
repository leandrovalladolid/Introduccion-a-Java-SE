import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            fileSended--;
            System.out.println("Por favor, enciendo el Bluetooth para iniciar la transferencia");
        }

        //AND &&
        //OR ||
        //NOR !
        int a = 2;
        int b = 3;

        System.out.println("El valor de a es -> " + a);
        System.out.println("El valor de b es -> " + b);
        //Operadores de asignación
        System.out.println("a es igual a b ->" + (a == b));
        System.out.println("a es diferente de b ->" + (a != b));

        //Operadores  relacionales
        System.out.println("a es mayor que b ->" + (a > b));
        System.out.println("a es menor que b ->" + (a < b));
        System.out.println("a es mayor igual que b ->" + (a >= b));
        System.out.println("a es menor igual que b ->" + (a <= b));

        System.out.println("###############");
        if (a == b) {
            System.out.println("a es igual a b");
        } else if ((a != b) && (a < b)) {
            System.out.println("a es mayor de b");
        }
    }
}
