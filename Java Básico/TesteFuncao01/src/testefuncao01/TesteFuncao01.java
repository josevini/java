package testefuncao01;

public class TesteFuncao01 {
    
    /*
        Procedimento - sem retorno
    
        static void soma(int a, int b) {
            int s = a + b;
            System.out.println(s);
        }
    */
    
    static int soma (int a, int b) {
        int s = a+b;
        return s;
    }

    public static void main(String[] args) {
        int s = soma(4, 5);
        System.out.println("A soma vale: " + s);
    }
    
}
