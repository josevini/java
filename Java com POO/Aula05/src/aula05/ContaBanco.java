package aula05;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Métodos Personalizados
    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
         this.setTipo(t);
         this.setStatus(true);
         if ("CC".equals(this.getTipo())) {
             this.setSaldo(50);
         } else if ("CP".equals(this.getTipo())) {
             this.setSaldo(150);
         } else {
             System.out.println("Tipo inválido!");
         }
         System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
            } else if (this.getSaldo() < 0) {
                System.out.println("Conta não pode ser fechada pois tem débito.");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
        } else {
            System.out.println("A conta já está fechada!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Conta fechada! Impossível depositar.");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Conta fechada! Impossível sacar.");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    // Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean st) {
        this.status = st;
    }
}
