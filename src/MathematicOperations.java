public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.ceil(x));

        System.out.println(Math.floor(x));

        System.out.println(Math.pow(45, 2));

        System.out.println(Math.max(x, y));

        System.out.println(Math.sqrt(y));

//        Area de un curculo
//        pi *r2
        System.out.println(Math.PI * Math.pow(y, 2));

        System.out.println(4 * Math.PI * Math.pow(y, 2));

//        Volumen de una esfera
        System.out.println(4 / 3 * Math.PI * Math.pow(y, 3));
    }
}
