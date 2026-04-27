import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);


        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Nota1: ");
        double nota1 = input.nextDouble();
        System.out.println("Nota2: ");
        double nota2 = input.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2, nome);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Media: " + aluno.CalculaMedia());

        System.out.println("======================================");

        aluno.setNota1(9.9);
        System.out.println("Alterando o valor da nota1 para " + aluno.getNota1());
        System.out.println("Nova Media: " + aluno.CalculaMedia());
    }
}

class Aluno {
    private double nota1;
    private double nota2;
    private String nome;

    public Aluno(double nota1 ,double nota2, String nome) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nome = nome;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }




    // setters
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double CalculaMedia() {
        return (nota1 + nota2) / 2;
    }

}