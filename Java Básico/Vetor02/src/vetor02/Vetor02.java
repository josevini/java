package vetor02;

public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai",
            "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int ano = 2019;
        
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            tot[1]++;
        }
        
        for (int i = 0; i < tot.length; i++) {
            System.out.printf("O mês de %s tem %d dias ao todo\n", mes[i], tot[i]);
        }
    }
    
}
