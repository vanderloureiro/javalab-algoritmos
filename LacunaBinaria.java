import java.util.Arrays;

public class LacunaBinaria {
    
    /*
     * Problema: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
    */
    public static void main(String args[]) {
        
        // 529 = 1000010001
        int representacao[] = {1,0,0,0,0,1,0,0,0,1};
        var represent = Integer.toString(529, 2);
        System.out.println(represent);
        int maiorLacuna = 0;
        for (int i : representacao) {
            System.out.println(i);
        }
    }

}
