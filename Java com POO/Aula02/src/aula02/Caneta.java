package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    void tampar() {
        if (this.tampada == false) {
            this.tampada = true;
        } else {
            System.out.println("Caneta já está tampada.");
        }
    }
    
    void destampar() {
        if (this.tampada == true) {
            this.tampada = false;
        } else {
            System.out.println("Caneta já está destampada.");
        }
    }
}
