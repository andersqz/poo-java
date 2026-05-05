package aula10.ex01.model;

import aula10.ex01.exceptions.CargaInvalidaException;

public class NaveCargueiro extends NaveEspacial {

    private Double pesoCargaAtual;
    private Double capacidadeMaximaCarga;

    public NaveCargueiro(String identificador, Double combustivelMaximo, Double velocidadeBase, Double pesoCargaAtual, Double capacidadeMaximaCarga) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.pesoCargaAtual = pesoCargaAtual;
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public Double getPesoCargaAtual() {
        return pesoCargaAtual;
    }

    public void setPesoCargaAtual(Double pesoCargaAtual) {
        if (pesoCargaAtual > capacidadeMaximaCarga)
            throw new CargaInvalidaException("Carga inválida.");
        this.pesoCargaAtual = pesoCargaAtual;
    }

    public Double getCapacidadeMaximaCarga() {
        return capacidadeMaximaCarga;
    }

    public void setCapacidadeMaximaCarga(Double capacidadeMaximaCarga) {
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        return (distanciaEmAnosLuz * 0.5) + (pesoCargaAtual * 0.2);
    }
}
