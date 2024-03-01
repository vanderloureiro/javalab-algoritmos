package dev.vanderloureiro.outros;

import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class InteiroParaBitArray {

    public static void main(String args[]) {

        Assertions.assertArrayEquals(new int[]{1,0,0,0,0,1,0,0,0,1}, executa(529));
        Assertions.assertArrayEquals(new int[]{1,0,0,0}, executa(8));
        Assertions.assertArrayEquals(new int[]{1,0,1,1,0}, executa(22));
        Assertions.assertArrayEquals(new int[]{1,0,1}, executa(5));
        Assertions.assertArrayEquals(new int[]{1,1,0}, executa(6));
    }

    private static int[] executa(int n) {
        List<Integer> lista = new ArrayList<>();
        while (n != 0) {
            int resto = n % 2;
            lista.add(0, resto);
            n = n / 2;
        }
        return lista.stream().mapToInt(Integer::intValue).toArray();
    }
}
