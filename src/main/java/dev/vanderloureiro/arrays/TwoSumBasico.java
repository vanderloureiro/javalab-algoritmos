package dev.vanderloureiro.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* Dado um array de inteiros 'numeros' e um inteiro 'alvo', retorne o indice de 2 numeros que somados sejam o 'alvo'
* Você deve assumir que cada lista tem uma resposta exata, e você não pode usar o mesmo elemento duas vezes
* Você pode retornar a resposta em qualquer ordem
*
* Exemplo:
* Input: nums = [2,7,11,15], alvo = 9
* Output: [0,1]
* Explicação: porque nums[0] + nums[1] == 9, nós retornamos [0, 1].
* */
public class TwoSumBasico {

    @Test
    public void twoSumBasico() {
        int[] numeros = {2, 7, 11, 15};
        int alvo = 9;
        int[] resposta = executa(numeros, alvo);
        Assertions.assertEquals(0, resposta[0]);
        Assertions.assertEquals(1, resposta[1]);
    }

    public static int[] executa(int[] nums, int alvo) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    continue;
                }
                if (nums[i] + nums[j] == alvo) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
