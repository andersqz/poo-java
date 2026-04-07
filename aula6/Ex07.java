public class Ex07 {
    public static void main(String[] args) {

        smartphone smart = new smartphone();

        
        System.out.println(smart.conectar4g());
        //System.out.println(smart.ligar());        
    }
}

class Eletronico {

    boolean estaLigado = false;

    public void ligar() {
        estaLigado = true;
    }
}

class smartphone extends Eletronico {

    boolean conectar4g = false;

    

    public void conectar4G() {
        conectar4G = true;
    }
}

