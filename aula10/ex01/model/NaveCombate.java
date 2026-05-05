package aula10.ex01.model;

public class NaveCombate extends NaveEspacial {

    private Integer numeroArmas;
    private Boolean escudoAtivado;

    public NaveCombate(String identificador, Double combustivelMaximo, Double velocidadeBase, Integer numeroArmas, Boolean escudoAtivado) {
        super(identificador, combustivelMaximo, velocidadeBase);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    public Integer getNumeroArmas() {
        return numeroArmas;
    }

    public void setNumeroArmas(Integer numeroArmas) {
        this.numeroArmas = numeroArmas;
    }

    public Boolean getEscudoAtivado() {
        return escudoAtivado;
    }

    public void setEscudoAtivado(Boolean escudoAtivado) {
        this.escudoAtivado = escudoAtivado;
    }

    @Override
    public double calcularConsumo(double distanciaEmAnosLuz) {
        double consumo = distanciaEmAnosLuz * 0.8;
        if (escudoAtivado) {
            consumo = consumo * 1.15;
        }
        return consumo;
    }
}
