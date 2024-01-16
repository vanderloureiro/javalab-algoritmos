package dev.vanderloureiro.outros;

public class Fatorial {

    public static void main(String args[]) {
        int valor = 1;
        int fatorial = 10;
        for (int i = fatorial; fatorial > 0; fatorial--) {
            valor = fatorial * valor;
        }
        System.out.println(valor);
    }
}
