package aula10.ex01.model;

public class NaveExploracao extends NaveEspacial {

    private Boolean possuiSensoresAvancados;

    public NaveExploracao(String identificador, Double combustivelMaximo, Double velocidadeBase, Boolean possuiSensoresAvancados) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    public Boolean getPossuiSensoresAvancados() {
        return possuiSensoresAvancados;
    }

    public void setPossuiSensoresAvancados(Boolean possuiSensoresAvancados) {
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        double consumo = distanciaEmAnosLuz * 0.3;
        if (possuiSensoresAvancados) {
            consumo += 50.0;
        }
        return consumo;
    }
}
