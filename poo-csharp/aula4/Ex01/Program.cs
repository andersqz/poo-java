using System;

class Program
{
    static void Main()
    {
        System.Console.WriteLine("Quantos objetos carros quer criar? ");
        int n = int.Parse(Console.ReadLine()!);

        Carro[] carro = new Carro[n];

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("Marca: ");
            string marca = Console.ReadLine();
            Console.WriteLine("Modelo: ");
            string modelo = Console.ReadLine();
            Console.WriteLine("Ano de fabricacao: ");
            int ano = int.Parse(Console.ReadLine()!);

            carro[i] = new Carro(marca, modelo, ano);
        }


        for (int i = 0; i < n; i++)
        {
            System.Console.WriteLine("Marca: " + carro[i].Marca);
            System.Console.WriteLine("Modelo: " + carro[i].Modelo);
            System.Console.WriteLine("Ano: " + carro[i].AnoFabricacao);
        }
    }
}

class Carro
{
    public string Marca;
    public string Modelo;
    public int AnoFabricacao;

    public Carro(string marca, string modelo, int anoFabricacao)
    {
        Marca = marca;
        Modelo = modelo;
        AnoFabricacao = anoFabricacao;
    }
}