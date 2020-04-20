package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = tec.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = tec.nextFloat();
        float m = (n1+n2)/2;
        System.out.printf("Sua média foi %.1f. ", m);
        if (m>9) {
            System.out.println("Parabéns!");
        }
    }

}
