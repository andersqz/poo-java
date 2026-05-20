
public class Ex02 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("João Silva");

        System.out.println("--- Operações Bancárias ---\n");

        try {
            System.out.println("Realizando depósito válido...");
            conta.depositar(1000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando fazer depósito negativo...");
            conta.depositar(-100.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nRealizando saque válido...");
            conta.sacar(200.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando saque maior que saldo...");
            conta.sacar(5000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n--- Outras Operações ---");
        conta.calcularImpostos();
        conta.fazerPix("chave@email.com", 150.00);

        System.out.println("\n" + conta.toString());
    }
}

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

---

package ex02.interfaces;

public interface Tributavel {
    void calcularImpostos();
}

public interface TransacaoOnline {
    void fazerPix(String chavePix, double valor);
}


public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    protected void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
    }
}

public class ContaCorrente extends ContaBancaria implements Tributavel, TransacaoOnline {
    private static final double TAXA_SAQUE = 5.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double totalSaque = valor + TAXA_SAQUE;
        
        if (totalSaque > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque. Saldo: R$ " + getSaldo() + " | Solicitado: R$ " + totalSaque);
        }
        
        debitar(totalSaque);
        System.out.println("Saque de R$ " + valor + " + taxa de R$ " + TAXA_SAQUE + " realizado. Novo saldo: R$ " + getSaldo());
    }

    @Override
    public void calcularImpostos() {
        double impostos = getSaldo() * 0.01;
        System.out.println("Cálculo de impostos: R$ " + impostos);
    }

    @Override
    public void fazerPix(String chavePix, double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            debitar(valor);
            System.out.println("Pix enviado para " + chavePix + " no valor de R$ " + valor + ". Novo saldo: R$ " + getSaldo());
        } else {
            System.out.println("Erro ao fazer Pix. Saldo insuficiente ou valor inválido.");
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente [titular=" + getTitular() + ", saldo=" + getSaldo() + ", taxaSaque=" + TAXA_SAQUE + "]";
    }
}