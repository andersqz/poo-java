public class Ex02 {
    public static void main(String[] args) {
        

    }
}


    
class ContaBancaria {

    private double saldo;
    private double limite;

    public void Sacar(double valor) {
        if (valor <= saldo + limite && valor > 0) {
            saldo = saldo - valor;
        }
    }

    public void setLimite(double limite) {
        if (limite < 0) {
            System.out.println("Não pode alterar o limite para menor que 0");
        } else {
            this.limite = limite;
        }
    }
}
