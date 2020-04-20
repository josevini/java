package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.printf("Digite o ano do seu nascimento: ");
        int nasc = t.nextInt();
        int i = 2019 - nasc;
        System.out.printf("Você tem %d anos de idade e é ", i);
        if (i >= 18) {
            System.out.printf("maior de Idade\n");
        } else {
            System.out.printf("menor de Idade\n");
        }
    }

}
