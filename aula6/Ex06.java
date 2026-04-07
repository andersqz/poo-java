public class Ex06 {
    public static void main(String[] args) {

        Circulo c = new Circulo(5.0, "azul");

        System.out.println(c.getCor());
        System.out.println(c.getRaio());
        
    }
}

class Forma {
    private String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }
}