public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelect = "Dark";

        switch (colorModeSelect) {
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night": //Ambar
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Bluer Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;
            default:
                System.out.println("Selecciona un opcion");


        }
    }
}
