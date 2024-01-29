package dev.vanderloureiro.outros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InverterStringJavaBuffer {

    @Test
    public void inverterString() {
        String inversao = executa("hello");
        Assertions.assertEquals("olleh", inversao);
    }

    private String executa(String texto) {
        StringBuffer buffer = new StringBuffer(texto);
        return buffer.reverse().toString();
    }
}
