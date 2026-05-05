package aula10.ex01.model;

import aula10.ex01.exceptions.CombustivelInvalidoException;
import aula10.ex01.exceptions.CombustivelInsuficienteException;

public abstract class NaveEspacial {

    private String identificador;
    private Double combustivelMaximo;
    private Double combustivelAtual;
    private Double velocidadeBase;

    public NaveEspacial() {}

    public NaveEspacial(String identificador, Double combustivelMaximo, Double velocidadeBase) {
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo;
        this.velocidadeBase = velocidadeBase;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCombustivelMaximo() {
        return combustivelMaximo;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMaximo = combustivelMaximo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        if (combustivelAtual < 0 || combustivelAtual > combustivelMaximo)
            throw new CombustivelInvalidoException("Valor de combustivel inválido!");
        this.combustivelAtual = combustivelAtual;
    }

    public double getVelocidadeBase() {
        return velocidadeBase;
    }

    public void setVelocidadeBase(double velocidadeBase) {
        this.velocidadeBase = velocidadeBase;
    }

    public abstract double calcularConsumo(double distanciaEmAnosLuz);

    public void viajar(double distancia) throws CombustivelInsuficienteException {
        double consumo = calcularConsumo(distancia);
        if (combustivelAtual < consumo)
            throw new CombustivelInsuficienteException("Combustível insuficiente para a viagem!");
        this.combustivelAtual -= consumo;
        System.out.println("A nave " + identificador + " viajou " + distancia + " anos-luz. Combustível restante: " + this.combustivelAtual);
    }
}
