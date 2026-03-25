import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Triangulo t = new Triangulo(5.0, 6.0, 4.0);

        t.setLadoA(11.5);
    }
}


class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoa, double ladob, double ladoc) {
        this.ladoA  = ladoa;
        this.ladoB = ladob;
        this.ladoC = ladoc;
    }

    public void setLadoA(double n) {
        if (n > this.ladoB + this.ladoC) {
            System.out.print("A alteração do lado A do triangulo não deve ser maior que a soma dos lados B e C");
        }
        else {
            this.ladoA = n;
        }
    }

    public void setLadoB(double n) {
        if (n > this.ladoA + this.ladoC) {
            System.out.print("A alteração do lado B do triangulo não deve ser maior que a soma dos lados A e C");
        }
        else {
            this.ladoB = n;
        }
    }

    public void setLadoC(double n) {
        if (n > this.ladoB + this.ladoA) {
            System.out.print("A alteração do lado C do triangulo não deve ser maior que a soma dos lados B e A");
        }
        else {
            this.ladoC = n;
        }
    }
}