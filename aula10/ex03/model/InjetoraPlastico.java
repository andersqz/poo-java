package aula10.ex03.model;

import aula10.ex03.exceptions.FaltaMateriaPrimaException;
import aula10.ex03.exceptions.MaquinaDesligadaException;

public class InjetoraPlastico extends MaquinaIndustrial {

    private double kgMateriaPrima;

    public InjetoraPlastico(String numeroSerie) {
        super(numeroSerie);
        this.kgMateriaPrima = 0;
    }

    public double getKgMateriaPrima() {
        return kgMateriaPrima;
    }

    public void abastecerPlastico(double kg) {
        if (kg < 0)
            throw new IllegalArgumentException("Quantidade de plástico não pode ser negativa.");
        this.kgMateriaPrima += kg;
        System.out.println("[" + getNumeroSerie() + "] Abastecida com " + kg + " kg de plástico. Total: " + kgMateriaPrima + " kg.");
    }

    @Override
    public void produzirLote(int quantidade) throws MaquinaDesligadaException, FaltaMateriaPrimaException {
        if (!isLigada())
            throw new MaquinaDesligadaException("A injetora " + getNumeroSerie() + " está desligada.");

        double plasticoNecessario = quantidade * 0.2;
        if (kgMateriaPrima < plasticoNecessario)
            throw new FaltaMateriaPrimaException("Plástico insuficiente. Necessário: " + plasticoNecessario + " kg. Disponível: " + kgMateriaPrima + " kg.");

        kgMateriaPrima -= plasticoNecessario;
        double energia = quantidade * 0.5;
        registrarProducao(quantidade, energia);
        System.out.println("[" + getNumeroSerie() + "] Lote de " + quantidade + " peças produzido. Plástico restante: " + kgMateriaPrima + " kg.");
    }
}
