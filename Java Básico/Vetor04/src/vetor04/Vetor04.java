package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(vet);
        for (int v: vet) {
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 9);
        System.out.printf("\nEncontrei o valor na posição %d\n", p);
    }
    
}
