package operadorternario;
import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        int n1 = teclado.nextInt(); // Primeiro número
        System.out.print("Segundo número: ");
        int n2 = teclado.nextInt(); // Segundo número
        int r = n1 > n2 ? n1 : n2; // int r = valor retornado
        System.out.println("Maior valor: " + r);
    }
}
