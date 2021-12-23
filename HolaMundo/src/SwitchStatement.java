public class SwitchStatement {
    public static void main(String[] args) {
       String colorModeSelected = "Dark";

       switch (colorModeSelected){
           case "Light":
               System.out.println("Modo Ligth");
               break;
           case "Night":
               System.out.println("Modo Nigth");
               break;
           case "Blue Dark":
               System.out.println("Modo Blue Dark");
               break;
           case "Dark":
               System.out.println("Modo Dark");
               break;
           default:
               System.out.println("Selecciona una opción correcta");
       }
    }
}
