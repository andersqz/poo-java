import java.util.Scanner;

public class Ex03 {
    public static void main() { 

        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = input.nextLine();
        System.out.println("Idade: ");
        int idade = input.nextInt();
        input.nextLine();
        System.out.println("Genero: ");
        String genero = input.nextLine();

        Pessoa p = new Pessoa(nome, idade, genero);

        p.Mostrar();
        input.close();
    }
}

class Pessoa {

    public String Nome;
    public int Idade;
    public String Genero;

    public Pessoa(String nome, int idade, String genero) {
        Nome = nome;
        Idade = idade;
        Genero = genero;
    }

    public void Mostrar() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Genero: " + Genero);
        System.out.println("-----------------------------");
    }
}
