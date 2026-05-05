package aula10.ex02.model;

public class Administrativo extends FuncionarioHospital {

    private String departamento;
    private boolean cargoDeGestao;

    public Administrativo(String nome, String matricula, double salarioBase, String departamento, boolean cargoDeGestao) {
        super(nome, matricula, salarioBase);
        this.departamento = departamento;
        this.cargoDeGestao = cargoDeGestao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isCargoDeGestao() {
        return cargoDeGestao;
    }

    public void setCargoDeGestao(boolean cargoDeGestao) {
        this.cargoDeGestao = cargoDeGestao;
    }

    @Override
    public double calcularSalarioFinal() {
        double salario = getSalarioBase();
        if (cargoDeGestao) {
            salario += 1500.00;
        }
        return salario;
    }
}
