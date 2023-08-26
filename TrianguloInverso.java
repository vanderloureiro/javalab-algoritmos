public class TrianguloInverso {

    public static void main(String args[]) {

        var tamanho = 4;
        for (int i = tamanho; i > 0; i--) {
            for (int j = i; j < tamanho; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}