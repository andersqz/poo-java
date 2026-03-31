package aula6;

public class Exemplo1 {
    public static void main(String[] args) {

        Desenho2D d = new Desenho2D();

        d.exibe();
        
    }
}


class Desenho {
    protected String nomeAutor = "SEI LA";
}

class Desenho2D extends Desenho {
    public void exibe() {
        System.out.println(nomeAutor);
    }
}