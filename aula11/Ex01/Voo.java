import java.util.Arrays;

public class Voo {
    private String numeroVoo;
    private String destino;
    private Boolean[] assentos;

    public Voo(String numeroVoo, String destino) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.assentos = new Boolean[100];

        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = false;
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void reservarAssento(int assento) {
        
        if (assento < 1 || assento > 100)
            throw new IllegalArgumentException("Escolha um assento valido.");

        int index = assento - 1;

        if (assentos[index] == true)
            throw new AssentoOcupadoException("Assento já está ocupado");
        assentos[index] = true;
    }

    @Override
    public String toString() {
        return "Voo [numeroVoo=" + numeroVoo + ", destino=" + destino;
    }

    
}
