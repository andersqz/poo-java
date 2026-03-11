package exercicios;
import java.util.Scanner;

public class Ex06 {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Nome aluno: ");
        String nome = input.nextLine();
        System.out.print("Matricula: ");
        int matricula = input.nextInt();
        input.nextLine();
        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        input.nextLine();
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();
        input.nextLine();
        System.out.print("Nota 3: ");
        double nota3 = input.nextDouble();
        input.nextLine();

        Aluno student = new Aluno(nome, matricula, nota1, nota2, nota3);

        student.Mostrar(); 
        input.close();
    }
}

class Aluno {

    public String Nome;
    public int Matricula;
    public double Nota1;
    public double Nota2;
    public double Nota3;
    public double Media;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {

        Nome = nome;
        Matricula = matricula;
        Nota1 = nota1;
        Nota2 = nota2;
        Nota3 = nota3;
    }

    public double CalculaMedia() {
        Media = (Nota1 + Nota2 + Nota3) / 3;
        return Media;
    }

    public void Mostrar() {
        System.out.println("\n\t DADOS \n");
        System.out.println("Nome: " + Nome);
        System.out.println("Matricula: " + Matricula);
        System.out.println("Nota 1: " + Nota1);
        System.out.println("Nota 2: " + Nota2);
        System.out.println("Nota 3: " + Nota3);

        if (CalculaMedia() >= 6.0) {
            System.out.println("Aprovado!");
            System.out.println("Media: " + Media);
        }
        else {
            System.out.println("Reprovado!");
            System.out.println("Media: " + Media);
        }

    }

}

