package exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(){

        Scanner input = new Scanner(System.in);

        System.out.println("\tCARRO 1\n");
        System.out.print("Marca: ");
        String marca = input.nextLine();
        System.out.print("Modelo: ");
        String modelo = input.nextLine();
        System.out.print("Ano de fabricacao: ");
        int ano = input.nextInt();
        input.nextLine();

        Carro car1 = new Carro(marca, modelo, ano);

        System.out.println("\tCARRO 2\n");
        System.out.print("Marca: ");
        String marca2 = input.nextLine();
        System.out.print("Modelo: ");
        String modelo2 = input.nextLine();
        System.out.print("Ano de fabricacao: ");
        int ano2 = input.nextInt();
        input.nextLine();

        Carro car2 = new Carro(marca2, modelo2, ano2);
        car1.Mostrar();
        car2.Mostrar();

        input.close();
    }
}

class Carro{
    public String Marca;
    public String Modelo;
    public int AnoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        Marca = marca;
        Modelo = modelo;
        AnoFabricacao = anoFabricacao;
    }

    public void Mostrar() {
        System.out.println("----------------------");
        System.out.println("Apresentação dos dados");
        System.out.println("----------------------");
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano de fabricacao: " + AnoFabricacao);
    }
}
