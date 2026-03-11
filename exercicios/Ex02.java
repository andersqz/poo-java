package exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main() {

        Scanner input = new Scanner(System.in);
        
        System.out.println("PC 1");
        System.out.print("Marca: ");
        String modelo = input.nextLine();
        System.out.print("Modelo: ");
        String marca = input.nextLine();
        System.out.print("Tipo: ");
        String tipo = input.nextLine();
        System.out.println("Preco: ");
        double preco = input.nextDouble();
        input.nextLine();

        System.out.println("PC 2");
        System.out.print("Marca: ");
        String modelo2 = input.nextLine();
        System.out.print("Modelo: ");
        String marca2 = input.nextLine();
        System.out.print("Tipo: ");
        String tipo2 = input.nextLine();
        System.out.println("Preco: ");
        double preco2 = input.nextDouble();
        input.nextLine();

        Computador pc = new Computador(modelo, marca, tipo, preco);
        Computador pc2 = new Computador(modelo2, marca2, tipo2, preco2);

        pc.Mostrar();
        pc2.Mostrar();
        input.close();

    }   
}

class Computador {

        public String Marca;
        public String Modelo;
        public String Tipo;
        public double Preco;

        public Computador(String modelo, String marca, String tipo, double preco) {

            Marca = marca;
            Modelo = modelo;
            Tipo = tipo;
            Preco = preco;
        }

        public void Mostrar() {
            System.out.println("----------------------");
            System.out.println("Modelo: " + Modelo);
            System.out.println("Marca: " + Marca);
            System.out.println("Tipo: " + Tipo);
            System.out.println("Preco: " + Preco);
            System.out.println("----------------------");
        }
        

}
