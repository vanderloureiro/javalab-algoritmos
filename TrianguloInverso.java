public class TrianguloInverso {

    public static void main(String args[]) {

        var tamanho = 4;
        for (int i = tamanho; i > 0; i--) {
            for (int j = i; j < tamanho; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}