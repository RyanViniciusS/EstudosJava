public class Aninhado {
    public static void main(String[] args) {
        int v = 10;
        for (int i = 1; i <= v; i++) {
            //System.out.println(i);
            for (int j = 1; j <= v; j++) {
                //System.out.println(j);
                //System.out.println(i + " x " + j + " = " + (i * j));
                var soma = i * j;
                System.out.println(i + "x" + j + "=" + soma);

            }
            System.out.println("-----------------");
        }

    }
}
