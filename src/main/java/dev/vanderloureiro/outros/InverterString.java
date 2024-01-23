package dev.vanderloureiro.outros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InverterString {

    @Test
    public void inverterString() {
        String inversao = executa("hello");
        Assertions.assertEquals("olleh", inversao);
    }

    public String executa(String texto) {
        String inversao = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            inversao += texto.charAt(i);
        }
        return inversao;
    }
}
