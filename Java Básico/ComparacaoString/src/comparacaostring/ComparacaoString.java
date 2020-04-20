package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res;
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);
    }
}
