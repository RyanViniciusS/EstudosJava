package ForCresente;

public class Aninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                var soma = i * j;
                System.out.println(i + "x" + j + "=" + soma);
            }
            System.out.println("______");
        }


    }
}
