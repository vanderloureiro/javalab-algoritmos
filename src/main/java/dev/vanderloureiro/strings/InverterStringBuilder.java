package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InverterStringBuilder {

    @Test
    public void inverterString() {
        String inversao = executa("hello");
        Assertions.assertEquals("olleh", inversao);
    }

    private String executa(String texto) {
        StringBuilder builder = new StringBuilder(texto);
        return builder.reverse().toString();
    }
}
