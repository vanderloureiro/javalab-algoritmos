package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class InverterStringSwap {

    @Test
    public void inverterString() {
        String inversao1 = executa("hello");
        Assertions.assertEquals("olleh", inversao1);

        String inversao2 = executa("Vanderlei");
        Assertions.assertEquals("ielrednaV", inversao2);

        String inversao3 = executa("Loureiro");
        Assertions.assertEquals("orieruoL", inversao3);
    }

    private String executa(String texto) {
        char[] inversao = texto.toCharArray();
        for (int i = 0, j = texto.length() - 1; i < texto.length() / 2 ; i++, j--) {
            inversao[j] = inversao[i];
            inversao[i] = texto.charAt(j);
        }
        return String.valueOf(inversao);
    }
}
