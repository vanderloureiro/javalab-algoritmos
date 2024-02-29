package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;

public class LacunaBinaria {

    /*
     * Problema: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
     */
    public static void main(String args[]) {

        // 529 = 1000010001
        // int representacao[] = {1,0,0,0,0,1,0,0,0,1};
        int resposta = lacunaBinaria(529);
        Assertions.assertEquals(4, resposta);
    }

    private static int lacunaBinaria(int n) {
        String representacao = Integer.toBinaryString(n);
        int maiorLacuna = 0;
        int lacunaCorrente = 0;
        for (int i = 0; i < representacao.length(); i++) {
            if (representacao.charAt(i) == '0') {
                lacunaCorrente++;
                if (lacunaCorrente > maiorLacuna) {
                    maiorLacuna = lacunaCorrente;
                }
            } else {
                lacunaCorrente = 0;
            }
        }
        return maiorLacuna;
    }

}
