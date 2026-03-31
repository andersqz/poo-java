
public class Ex03 {
    public static void main(String[] args) {

        Carro car = new Carro();

        System.out.println(car.velocidade = 6.7);
       System.out.println(car.Acelerar("VRUMMMMM"));
    }
}


class Veiculo {
    protected double velocidade;
}

class Carro extends Veiculo {

    public String Acelerar(String som) {
        return som;
    }
}