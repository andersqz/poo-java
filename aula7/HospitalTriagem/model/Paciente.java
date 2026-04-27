package aula7.HospitalTriagem.model;

public class Paciente {
    
    private String nome;
    private String plano;
    private double peso;

    public Paciente() {}

    public Paciente(String nome, String plano, double peso) {
        this.nome = nome;
        this.plano = plano;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", plano=" + plano + ", peso=" + peso + "]";
    }

    
}
