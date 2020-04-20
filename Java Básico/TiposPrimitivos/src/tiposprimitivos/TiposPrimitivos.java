package tiposprimitivos;
import java.util.Scanner;
        
public class TiposPrimitivos {
    public static void main(String[] args) {
        //float nota = 8.5f;
        //String nome = "Vinícius";
        //System.out.println("A nota é " + nota);
        //System.out.format("A nota é %.1f\n", nota);
        //System.out.printf("A nota de %s é %.1f\n", nome, nota);

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.printf("Digite sua nota: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f\n", nome, nota);
    }
}
