public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //Decremento
        System.out.println(lives);//3

        lives++; //Incremento
        System.out.println(lives); //4


        //Prefija
        // Gana un regalo por ganar una vida
        int giftPrefijo = 100 + ++lives; // Obtiene el dato Incrementado
        int giftPosFijo = 100 + lives++; // añade el valor al lives
        System.out.println(giftPrefijo);
        System.out.println(giftPosFijo);

    }
}
