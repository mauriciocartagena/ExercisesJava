public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //        Area de un curculo
//        pi *r2
        double area = circleArea(y);
        System.out.println(area);
        /***
         *
         * Hello world
         * */

//        Volumen de una esfera
//     4 * Math.PI * Math.pow(y, 2)
        sphereArea(y);
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar(1000, "COP"));

    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda : Solo acepta MXN O COP
     * @return quantity Devuelve la cantidad actualizada en Dolares
     * */
    public static double converToDolar(double quantity, String currency) {
        switch (currency) {
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
