package aula10.ex03;

import aula10.ex03.exceptions.FaltaMateriaPrimaException;
import aula10.ex03.exceptions.MaquinaDesligadaException;
import aula10.ex03.model.BracoRoboticoMontagem;
import aula10.ex03.model.InjetoraPlastico;
import aula10.ex03.model.MaquinaIndustrial;
import aula10.ex03.model.PrensaHidraulica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        InjetoraPlastico injetora = new InjetoraPlastico("INJ-001");
        BracoRoboticoMontagem braco = new BracoRoboticoMontagem("ROB-002");
        PrensaHidraulica prensa = new PrensaHidraulica("PRE-003");

        List<MaquinaIndustrial> maquinas = new ArrayList<>();
        maquinas.add(injetora);
        maquinas.add(braco);
        maquinas.add(prensa);

        injetora.abastecerPlastico(10.0);

        System.out.println("\n--- Teste: produzir com máquinas desligadas ---");
        for (MaquinaIndustrial maquina : maquinas) {
            try {
                maquina.produzirLote(60);
            } catch (MaquinaDesligadaException e) {
                System.out.println("ERRO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("ERRO inesperado: " + e.getMessage());
            }
        }

        System.out.println("\n--- Ligando todas as máquinas ---");
        for (MaquinaIndustrial maquina : maquinas) {
            maquina.ligar();
        }

        System.out.println("\n--- Turno de trabalho: 3 lotes de 40 peças ---");
        for (int lote = 1; lote <= 3; lote++) {
            System.out.println("\n[Lote " + lote + "]");
            for (MaquinaIndustrial maquina : maquinas) {
                try {
                    maquina.produzirLote(40);
                } catch (MaquinaDesligadaException e) {
                    System.out.println("ERRO [" + maquina.getNumeroSerie() + "]: " + e.getMessage());
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: Falta matéria prima! " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("ALARME [" + maquina.getNumeroSerie() + "]: " + e.getMessage());
                }
            }
        }

        System.out.println("\n--- Relatório Final ---");
        for (MaquinaIndustrial maquina : maquinas) {
            System.out.println("Número de série: " + maquina.getNumeroSerie());
            System.out.println("Peças produzidas: " + maquina.getPecasProduzidasTotais());
            System.out.println("Energia consumida: " + maquina.getEnergiaConsumidaKWh() + " kWh");
            System.out.println("----------------------------------");
        }
    }
}
