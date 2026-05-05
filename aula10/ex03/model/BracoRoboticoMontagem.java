package aula10.ex03.model;

import aula10.ex03.exceptions.EquipamentoDescalibradoException;
import aula10.ex03.exceptions.MaquinaDesligadaException;

public class BracoRoboticoMontagem extends MaquinaIndustrial {

    private double percentualCalibracao;

    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
        this.percentualCalibracao = 100.0;
    }

    public double getPercentualCalibracao() {
        return percentualCalibracao;
    }

    public void recalibrar() {
        this.percentualCalibracao = 100.0;
        System.out.println("[" + getNumeroSerie() + "] Robô recalibrado para 100%.");
    }

    @Override
    public void produzirLote(int quantidade) throws MaquinaDesligadaException, EquipamentoDescalibradoException {
        if (!isLigada())
            throw new MaquinaDesligadaException("O braço robótico " + getNumeroSerie() + " está desligado.");

        if (percentualCalibracao < 20.0)
            throw new EquipamentoDescalibradoException("Calibração insuficiente: " + percentualCalibracao + "%. Mínimo: 20%.");

        double reducaoCalibracao = quantidade * 0.5;
        percentualCalibracao -= reducaoCalibracao;
        if (percentualCalibracao < 0) {
            percentualCalibracao = 0;
        }

        registrarProducao(quantidade, 15.0);
        System.out.println("[" + getNumeroSerie() + "] Lote de " + quantidade + " peças produzido. Calibração atual: " + percentualCalibracao + "%.");
    }
}
