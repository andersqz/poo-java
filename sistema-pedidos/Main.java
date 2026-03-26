import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notepad 11", 999.90);

        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());

        p1.setNome("Iphone 17");
        p1.setPreco(2500.00);

        System.out.println("=================");

        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());

    }
}