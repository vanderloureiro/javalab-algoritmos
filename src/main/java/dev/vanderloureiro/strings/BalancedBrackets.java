package dev.vanderloureiro.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class BalancedBrackets {

    @Test
    public void balancedBrackets() {
        boolean resposta = executa("{{[[((()))]]}}");
        Assertions.assertEquals(true, resposta);
    }

    private boolean executa(String texto) {
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != '{' && c != '[' && c != '(' && c != ')' && c != ']' && c != '}') {
                return false;
            }
            if (!pilha.empty() && pilha.peek().equals(inverso(c))) {
                pilha.pop();
            } else {
                pilha.push(c);
            }
        }
        return pilha.empty();
    }

    private char inverso(char c) {
        if ( c == '}') return '{';
        if ( c == '{') return '}';
        if ( c == ']') return '[';
        if ( c == '[') return ']';
        if ( c == '(') return ')';
        return '(';
    }

}
