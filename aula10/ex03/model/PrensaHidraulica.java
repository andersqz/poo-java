package aula10.ex03.model;

import aula10.ex03.exceptions.MaquinaDesligadaException;
import aula10.ex03.exceptions.SuperaquecimentoException;

public class PrensaHidraulica extends MaquinaIndustrial {

    private double temperaturaAtual;

    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
        this.temperaturaAtual = 25.0;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void acionarRefrigeracao() {
        this.temperaturaAtual = 25.0;
        System.out.println("[" + getNumeroSerie() + "] Refrigeração acionada. Temperatura: 25.0°C.");
    }

    @Override
    public void produzirLote(int quantidade) throws MaquinaDesligadaException, SuperaquecimentoException {
        if (!isLigada())
            throw new MaquinaDesligadaException("A prensa " + getNumeroSerie() + " está desligada.");

        if (temperaturaAtual >= 90.0)
            throw new SuperaquecimentoException("Superaquecimento detectado: " + temperaturaAtual + "°C. Acione a refrigeração.");

        double energiaGasta = quantidade * 2.0;
        temperaturaAtual += quantidade * 1.5;
        registrarProducao(quantidade, energiaGasta);
        System.out.println("[" + getNumeroSerie() + "] Lote de " + quantidade + " peças produzido. Temperatura atual: " + temperaturaAtual + "°C.");
    }
}
