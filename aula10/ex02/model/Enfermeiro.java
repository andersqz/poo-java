package aula10.ex02.model;

import aula10.ex02.exceptions.ValorInvalidoException;

public class Enfermeiro extends FuncionarioHospital {

    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(String nome, String matricula, double salarioBase, String setor, double percentualInsalubridade) {
        super(nome, matricula, salarioBase);
        this.setor = setor;
        setPercentualInsalubridade(percentualInsalubridade);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getPercentualInsalubridade() {
        return percentualInsalubridade;
    }

    public void setPercentualInsalubridade(double percentualInsalubridade) {
        if (percentualInsalubridade != 0.10 && percentualInsalubridade != 0.20 && percentualInsalubridade != 0.40)
            throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
        this.percentualInsalubridade = percentualInsalubridade;
    }

    @Override
    public double calcularSalarioFinal() {
        double bonusInsalubridade = getSalarioBase() * percentualInsalubridade;
        double horasExtra = 0;
        if (getHorasTrabalhadasMensais() > 160) {
            horasExtra = (getHorasTrabalhadasMensais() - 160) * 50.0;
        }
        return getSalarioBase() + bonusInsalubridade + horasExtra;
    }
}
