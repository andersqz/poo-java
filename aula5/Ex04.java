import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==== Calculo Area Retangulo ====");
        System.out.println("Digite a largura: ");
        double largura = input.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = input.nextDouble();

        Retangulo r = new Retangulo(altura, largura);

        System.out.println("Altura: " + r.getAltura());
        System.out.println("Largura: " + r.getLargura());
        System.out.println("=============================");
        System.out.println("Area: " + r.getArea());
        input.close();
    }
}

class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea() {
        return this.altura * this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLargura() {
        return this.largura;
    }
}
