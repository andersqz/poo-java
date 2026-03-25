import java.util.Scanner;

public class Ex01 {
     {

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        input.nextLine();

        Carro[] carro = new Carro[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Marca: ");
            String marca = input.nextLine();

            System.out.print("Modelo: ");
            String modelo = input.nextLine();

            System.out.print("Ano de fabricacao: ");
            int anoFabricacao = input.nextInt();
            input.nextLine();

            carro[i] = new Carro(marca, modelo, anoFabricacao);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Marca: " + carro[i].Marca);
            System.out.println("Modelo: " + carro[i].Modelo);
            System.out.println("Ano Fabricacao: " + carro[i].AnoFabricacao);
        }
        input.close();
    } 
}

class Carro {

    public String Marca;
    public String Modelo;
    public int AnoFabricacao;
    
    public Carro(String marca, String modelo, int anoFabricacao) {
        Marca = marca;
        Modelo = modelo;
        AnoFabricacao = anoFabricacao;
    }
}