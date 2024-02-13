package dev.vanderloureiro.busca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuscaBinariaRecursiva {

    @Test
    public void buscaBinaria() {
        int[] numeros = {2, 7, 11, 15, 35, 48, 52, 63, 64, 65, 70};
        int alvo = 35;
        int resposta = executa(numeros, alvo);
        Assertions.assertEquals(4, resposta);
    }

    private int executa(int[] lista, int elemento) {
        return this.executa(lista, elemento, 0, lista.length - 1);
    }

    private int executa(int[] lista, int elemento, int inicio, int fim) {

        int meio = ((fim - inicio) / 2) + inicio;

        if (lista[meio] == elemento) {
            return meio;
        }
        if (fim - inicio == 1) {
            return -1;
        }
        if (elemento < lista[meio]) {
            return executa(lista, elemento, inicio, meio);
        }
        if (elemento > lista[meio]) {
            return executa(lista, elemento, meio, fim);
        }
        return -1;
    }
}
