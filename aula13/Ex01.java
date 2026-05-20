
public class Ex01 {
    public static void main(String[] args) {
        Smartwatch smartwatch = new Smartwatch("Apple");

        System.out.println("--- Operações do Smartwatch ---");
        smartwatch.exibirMarca();
        smartwatch.ligar();
        smartwatch.conectarBluetooth();
        smartwatch.medirBatimentos();

        System.out.println("\n" + smartwatch.toString());
    }
}


public abstract class Dispositivo {
    protected String marca;

    public Dispositivo(String marca) {
        this.marca = marca;
    }

    public void exibirMarca() {
        System.out.println("Marca: " + marca);
    }

    public abstract void ligar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


public interface Conectividade {
    void conectarBluetooth();
}


public interface Monitoramento {
    void medirBatimentos();
}

public class Smartwatch extends Dispositivo implements Conectividade, Monitoramento {

    public Smartwatch(String marca) {
        super(marca);
    }

    @Override
    public void ligar() {
        System.out.println("Smartwatch " + marca + " ligado!");
    }

    @Override
    public void conectarBluetooth() {
        System.out.println("Conectando ao Bluetooth no Smartwatch " + marca + "...");
    }

    @Override
    public void medirBatimentos() {
        System.out.println("Medindo batimentos cardíacos no pulso...");
    }

    @Override
    public String toString() {
        return "Smartwatch [marca=" + marca + "]";
    }
}
