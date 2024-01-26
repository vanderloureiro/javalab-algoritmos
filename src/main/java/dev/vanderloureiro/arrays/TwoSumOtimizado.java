package dev.vanderloureiro.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOtimizado {

    @Test
    public void twoSumOtimizado() {
        int[] numeros = {11, 15, 2, 7};
        int alvo = 9;
        int[] resposta = executa(numeros, alvo);
        Assertions.assertEquals(2, resposta[0]);
        Assertions.assertEquals(3, resposta[1]);
    }

    public int[] executa(int[] nums, int alvo) {
        Map<Integer, Integer> complementos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (complementos.containsKey(nums[i])) {
                return new int[]{complementos.get(nums[i]), i};
            }
            int complemento = alvo - nums[i];
            complementos.put(complemento, i);
        }
        return null;
    }
}
