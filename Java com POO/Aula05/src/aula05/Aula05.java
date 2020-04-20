package aula05;
public class Aula05 {
public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC"); // msg 1
        p1.depositar(150); // msg 2
        p1.sacar(200); // msg 3
        //p1.fecharConta();
        p1.pagarMensal();
        p1.depositar(20);
        p1.sacar(8);
        p1.fecharConta();
        p1.estadoAtual();
        
//        ContaBanco p2 = new ContaBanco();
//        p2.setNumConta(2222);
//        p2.setDono("Creuza");
//        p2.estadoAtual();
    }
}
