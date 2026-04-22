public class Ex08 {
    public static void main(String[] args) {

        Conta c1 = new Conta(1000);
        Conta c2 = new ContaPoupanca(1000);

        System.out.println("=== Conta comum ===");
        c1.render();

        System.out.println("=== Conta Poupança ===");
        c2.render();
        
    }
}


class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void render() {
        System.out.println("Conta comum nao tem rendimento.");
        System.out.println("Saldo atual: " + this.saldo);
    }
}


class ContaPoupanca extends Conta {
    
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void render() {
        this.saldo = this.saldo * 1.01;
        System.out.println("Rendimento de 1% aplicado");
        System.out.println("Novo saldo: " + this.saldo);
    }
}
