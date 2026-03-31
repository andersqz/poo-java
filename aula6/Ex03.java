
public class Ex03 {
    public static void main(String[] args) {

        Carro car = new Carro();

        System.out.println(car.velocidade);
        car.Acelerar();
        
    }
}


class Veiculo {
    protected double velocidade = 55.6;
}

class Carro extends Veiculo {

    public void Acelerar() {
        System.out.println("vrujmmmm");
    }
}