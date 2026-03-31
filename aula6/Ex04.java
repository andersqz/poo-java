
public class Ex04 {
    public static void main(String[] args) {
        
        Gerente geras = new Gerente();
        System.out.println(geras.calcularSalario(5000.00));

        Vendedor vendas = new Vendedor();
        System.out.println(vendas.calcularSalario(2500.00));

    }
}

class Funcionario {
    protected double salario;

    public double calcularSalario(double salario) {
        return salario;
    }
}

class Gerente extends Funcionario {

}

class Vendedor extends Funcionario {

}
