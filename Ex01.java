import java.util.Scanner;
import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        char opcao;

        do {

            System.out.print("Digite o nome do aluno: ");
            String nome = input.nextLine();
            System.out.print("Digite a nota do aluno: ");
            double nota = input.nextDouble();
            System.out.print("Digite a idade do aluno: ");
            int idade = input.nextInt();

            Aluno aluno = new Aluno(nome, nota, idade);
            listaAluno.add(aluno);

            System.out.println("Deseja cadastrar um aluno? (S/N): ");
            opcao = input.next().charAt(0);
            input.nextLine();

        } while (opcao == 's' || opcao == 'S');

        for (Aluno i : listaAluno) {
            System.out.println(i);
        }
    }    
}

class Aluno {
    private String nome;
    private double nota;
    private int idade;

    public Aluno(String nome, double nota, int idade) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + "|"+ "nota: " + nota + "|" +"idade: " + idade;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    public double getNota(){
        return this.nota;
    }

    public int getIdade() {
        return this.idade;
    }

    //setters
    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}