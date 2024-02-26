package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InverterString {

    @Test
    public void inverterString() {
        String inversao2 = executa("World");
        Assertions.assertEquals("dlroW", inversao2);
    }


    public String executa(String texto) {
        StringBuilder inversao = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            inversao.insert(0, texto.charAt(i));
        }
        return inversao.toString();
    }
}
