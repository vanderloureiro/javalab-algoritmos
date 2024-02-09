package dev.vanderloureiro.busca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BuscaBinariaRecursiva {

    @Test
    public void buscaBinaria() {
        int[] numeros = {2, 7, 11, 15, 35, 48, 52, 63, 64, 65, 70};
        int alvo = 65;
        int resposta = executa(numeros, alvo);
        Assertions.assertEquals(alvo, resposta);
    }

    private int executa(int[] lista, int elemento) {
        int meio = lista.length / 2;
        if (lista[meio] == elemento) {
            return lista[meio];
        }
        if (lista.length == 1) {
            return -1;
        }
        if (elemento < lista[meio]) {
            int[] novaLista = Arrays.copyOfRange(lista, 0, meio);
            return executa(novaLista, elemento);
        }
        if (elemento > lista[meio]) {
            int[] novaLista = Arrays.copyOfRange(lista, meio, lista.length);
            return executa(novaLista, elemento);
        }
        return -1;
    }
}
