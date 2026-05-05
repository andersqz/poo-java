package aula10.ex02;

import aula10.ex02.exceptions.ValorInvalidoException;
import aula10.ex02.model.Administrativo;
import aula10.ex02.model.Enfermeiro;
import aula10.ex02.model.FuncionarioHospital;
import aula10.ex02.model.Medico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FuncionarioHospital> folhaPagamento = new ArrayList<>();

        Medico medico = new Medico("Dr. Carlos Silva", "MED-001", 8500.00, "Cirurgia", 1200.00, 5);
        Enfermeiro enfermeiro = new Enfermeiro("Ana Paula", "ENF-042", 3200.00, "UTI", 0.40);
        Administrativo administrativo = new Administrativo("Roberto Souza", "ADM-017", 2800.00, "Recursos Humanos", true);

        enfermeiro.setHorasTrabalhadasMensais(180);

        folhaPagamento.add(medico);
        folhaPagamento.add(enfermeiro);
        folhaPagamento.add(administrativo);

        try {
            administrativo.setSalarioBase(900.00);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            enfermeiro.setPercentualInsalubridade(0.99);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            medico.setHorasTrabalhadasMensais(400);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println();

        for (FuncionarioHospital funcionario : folhaPagamento) {
            funcionario.exibirResumoMensal();
        }
    }
}
