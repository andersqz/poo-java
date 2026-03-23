import java.util.Scanner;

public class Ex04 {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Titulo: ");
        String titulo = input.nextLine();
        System.out.println("Autor: ");
        String autor = input.nextLine();
        System.out.println("Ano de lancamento: ");
        int ano = input.nextInt();
        input.nextLine();

        Livro book = new Livro(titulo, autor, ano);

        book.Mostrar();
        input.close();
    }
}

class Livro {

    public String Titulo;
    public String Autor;
    public int AnoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {

        Titulo = titulo;
        Autor = autor;
        AnoPublicacao = anoPublicacao;
    }

    public void Mostrar() {

        System.out.println("--------------------------------------");
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Ano de lancamento: " + AnoPublicacao);
        System.out.println("--------------------------------------");     
    }
}
