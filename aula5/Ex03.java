import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = input.nextDouble();

        Aluno a = new Aluno(nota);
        System.out.println("Nota: " + a.getNota());

        System.out.println("==================================");
        
        System.out.print("Altere a nota " + a.getNota() + " para uma nova nota (entre 0 e 10): ");
        nota = input.nextDouble();

        a.setNota(nota);
        System.out.println("Alterado valor de nota para: " + a.getNota());
        input.close();
    }
}


class Aluno {
    private double Nota;

    public Aluno(double nota) {
        this.Nota = nota;
    }

    public double getNota() {
        return this.Nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.Nota = nota;
        } else {
            System.out.println("Nota inválida!");
        }
    }
}