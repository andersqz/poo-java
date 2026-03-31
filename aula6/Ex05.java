public class Ex05 {
    public static void main(String[] args) {
        
        ProdutoEletronico tech = new ProdutoEletronico();

        tech.nome = "Notebook";
        tech.preco = 2000.00;

        System.out.println(tech.nome);
        System.out.println(tech.preco);
        System.out.println(tech.getGarantia() + "Anos");

    }
}


class Produto {
    protected String nome;
    protected double preco;
}

class ProdutoEletronico extends Produto {
    private int garantia;

    public int getGarantia() {
        return garantia = 5;
    }
}