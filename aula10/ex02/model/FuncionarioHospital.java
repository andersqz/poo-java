package aula10.ex02.model;

import aula10.ex02.exceptions.ValorInvalidoException;

public abstract class FuncionarioHospital {

    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    public FuncionarioHospital(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.horasTrabalhadasMensais = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412.00)
            throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.");
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabalhadasMensais() {
        return horasTrabalhadasMensais;
    }

    public void setHorasTrabalhadasMensais(int horasTrabalhadasMensais) {
        if (horasTrabalhadasMensais < 0 || horasTrabalhadasMensais > 300)
            throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.");
        this.horasTrabalhadasMensais = horasTrabalhadasMensais;
    }

    public abstract double calcularSalarioFinal();

    public void exibirResumoMensal() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas trabalhadas: " + horasTrabalhadasMensais);
        System.out.println("Salário final: R$ " + String.format("%.2f", calcularSalarioFinal()));
        System.out.println("----------------------------------");
    }
}
