package exercicios;
import java.util.Scanner;

public class Ex05 {
    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("Nome do produto: ");
        String nome = input.nextLine();
        System.out.println("Preco: ");
        double preco = input.nextDouble();
        System.out.println("Quantidade: ");
        int quantidade = input.nextInt();

        Produto p = new Produto(nome, preco, quantidade);
        
        p.Mostrar();
        input.close();

    }
}


class Produto {

    public String Nome;
    public double Preco;
    public int Quantidade;

    public Produto(String nome, double preco, int quantidade) {

        Nome = nome;
        Preco = preco;
        Quantidade = quantidade;
    }

    public double ValorEstoque() {
        return Preco * Quantidade;
    }

    public void Mostrar() {

        System.out.println("------------------------------");
        System.out.println("Nome do produto: " + Nome);
        System.out.println("Preco: " + Preco);
        System.out.println("Quantidade: " + Quantidade);
        System.out.println("Valor em estoque: " + ValorEstoque());
        System.out.println("------------------------------");
    }


}