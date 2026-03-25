public class Ex07 {
    public static void main(String[] args) {

        Cronometro s = new Cronometro(1);

        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        s.PassarTempo();
        


        
        
    }
}


class Cronometro {
    private int segundos;

    public int getSegundos() {
        return segundos;
    }

    public Cronometro(int segundos) {
        this.segundos = segundos;
    }

    public void PassarTempo() {
        this.segundos++;
        System.out.println(getSegundos());
    }
}