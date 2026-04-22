public class Ex09 {
    public static void main(String[] args) {

        Pessoa p = new Aluno("Anderson", 21, 432794);

        System.out.println(p.toString());


        
    }
}


class Pessoa {
    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " | Idade: " + this.idade + " | Matricula: " + this.matricula;
    }
}