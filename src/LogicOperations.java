public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;


        System.out.println("a es diferente que b: " + (a != b));

//        operadores relacionales
        System.out.println("a es menor que b: " + (a < b));
        System.out.println("a es mayor que b: " + (a > b));
        System.out.println("a es menor o igual que b: " + (a <= b));
        System.out.println("a es mayor o igual que b: " + (a >= b));

        if (a == b) {
            System.out.println("a es igual que b");
        } else if ((a < b) && (a > b)) {
            System.out.println("a es mayor que b");
        } else if (a > b) {
            System.out.println("a es mayor que b");
        } else if (a <= b) {
            System.out.println("a es menor o igual que b ");
        } else if (a >= b) {
            System.out.println("a es mayor o igual que b");
        }


    }

}
