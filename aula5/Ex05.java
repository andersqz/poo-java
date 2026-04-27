import java.util.Scanner;
import java.util.ArrayList;


public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("==== Cadastro de produto ====");
        System.out.print("Nome do produto: ");
        String nome = in.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = in.nextInt();

        Produto Item = new Produto(nome, quantidade);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        
        listaProdutos.add(Item);
        
        for (Produto i : listaProdutos) {
            System.out.println(i.toString());
        }
    }
}

class Produto {

    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeEmEstoque() {
        return this.quantidadeEmEstoque;
    }

    public void addEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void delEstoque(int quantidade) {
        if (quantidade > this.quantidadeEmEstoque) {
            System.out.print("Quantidade indisponível!");
        } 
        else {
            this.quantidadeEmEstoque -= quantidade;
        }
    }

    public String toString() {
        return "Produto " + this.nome + ", Quantidade: " + this.quantidadeEmEstoque;
    }
}