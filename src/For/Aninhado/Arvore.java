package Aninhado;

public class Arvore {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("linha" + i);
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print("-");
            }

        }

    }
}
