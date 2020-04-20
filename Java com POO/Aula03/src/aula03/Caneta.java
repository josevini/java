package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
        
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Caneta tampada");
        } else {
            System.out.println("Rabiscando...");
        }
    }
    
    public void tampar() {
        if (this.tampada == false) {
            this.tampada = true;
        } else {
            System.out.println("Caneta já está tampada.");
        }
    }
    
    public void destampar() {
        if (this.tampada == true) {
            this.tampada = false;
        } else {
            System.out.println("Caneta já está destampada.");
        }
    }
}
