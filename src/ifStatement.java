public class ifStatement {
    public static void main(String[] args) {
        boolean isBluettothEnabled = false;
        int fileSended = 3;

        if (isBluettothEnabled) {
            // Send File
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.err.println("Porfavor enciende");
        }

    }
}
