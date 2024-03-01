package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;

public class LacunaBinaria {

    /*
     * Problema: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
     */
    public static void main(String args[]) {

        Assertions.assertEquals(4, executa(529));
        Assertions.assertEquals(0, executa(8));
        Assertions.assertEquals(1, executa(22));
        Assertions.assertEquals(1, executa(5));
        Assertions.assertEquals(0, executa(6));
    }

    private static int executa(int n) {
        String representacao = Integer.toBinaryString(n);
        int maiorLacuna = 0;
        int lacunaCorrente = 0;
        for (int i = 0; i < representacao.length(); i++) {
            if (representacao.charAt(i) == '0') {
                lacunaCorrente++;
            } else {
                maiorLacuna = Integer.max(maiorLacuna, lacunaCorrente);
                lacunaCorrente = 0;
            }
        }
        return maiorLacuna;
    }

}
