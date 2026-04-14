import java.util.InputMismatchException;

class Paciente {
    private String nome;
    private double peso;
    private String planoDeSaude;

    // Método construtor
    public Paciente(String nome, double peso, String planoDeSaude) {
        this.nome = nome;
        this.peso = peso;
        this.planoDeSaude = planoDeSaude;
    }

    // getters
    public String getNome()         { return nome; }
    public double getPeso()         { return peso; }
    public String getPlanoDeSaude() { return planoDeSaude; }
}