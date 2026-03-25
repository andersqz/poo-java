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


}
