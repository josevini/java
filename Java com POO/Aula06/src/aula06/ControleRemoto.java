package aula06;
public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int vol) {
        this.volume = vol;
    }
    
    public boolean getLigado() {
        return this.ligado;
    }
    
    public void setLigado(boolean lig) {
        this.ligado = lig;
    }
    
    public boolean getTocando() {
        return this.tocando;
    }
    
    public void setTocando(boolean toc) {
        this.tocando = toc;
    }
    
    // Métodos
    
    public void estado() {
        System.out.println("Volume: " + (this.getLigado() == false? "indisponível" : this.getVolume()));
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
    }
    
    @Override
    public void ligar() {
        if (this.getLigado() == false) {
            this.setLigado(true);
            System.out.println("Ligando...");
        } else {
            System.out.println("Dispositivo já está ligado");
        }
    }
    
    @Override
    public void desligar() {
        if (this.getLigado()) {
            if (this.getTocando()) {
                this.setTocando(false);
            }
            this.setLigado(false);
            System.out.println("Desligando...");
        } else {
            System.out.println("Dispositivo já está desligado");
        }
    }
    
    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("   Abrindo o Menu");
            System.out.println("---------------------");
            System.out.print(" Volume: ");
            for (int i= 1; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.print(this.getVolume() == 0? "Mudo": "");
            System.out.println("");
            System.out.println(" Está ligado? " + this.getLigado());
            System.out.println(" Está tocando? " + this.getTocando());
            System.out.println("---------------------");
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando o Menu");
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 10);
            } else {
                System.out.println("Volume máximo alcançado");
            }  
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 10);
            } else {
                System.out.println("Volume mínimo");
            }
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void ligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
            } else {
                System.out.println("Dispositivo já está mutado");
            }
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void desligarMudo() {
        if (this.getLigado()) {
            if (this.getVolume() == 0) {
                this.setVolume(50);
            } else {
                System.out.println("Dispositivo não está mutado");
            }
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void play() {
        if (this.getLigado()) {
            if (this.getTocando() == false) {
                this.setTocando(true);
            } else {
                System.out.println("Dispositivo já está tocando");
            }
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
    
    @Override
    public void pause() {
        if (this.getLigado()) {
            if (this.getTocando() == true) {
                this.setTocando(false);
            } else {
                System.out.println("Dispositivo já está pausado");
            }
        } else {
            System.out.println("Dispositivo encontra-se desligado");
        }
    }
}
