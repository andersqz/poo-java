public class Ex11 {
    public static void main(String[] args) {

        // ItemMenu comum
        ItemMenu item = new ItemMenu("Frango grelhado", 25.90);

        // criando Sobremesa, passa nome e preco pro pai via super()
        Sobremesa sobremesa1 = new Sobremesa("Pudim", 12.50, true);
        Sobremesa sobremesa2 = new Sobremesa("Mouse de Maracuja", 10.00, false);

        // polimorfismo: variavel do tipo pai guardando um objeto filho
        ItemMenu sobremesaPoli = new Sobremesa("Brownie", 14.00, true);

        System.out.println(item);
        System.out.println(sobremesa1);
        System.out.println(sobremesa2);
        System.out.println(sobremesaPoli);

        
    }
}

class ItemMenu {
    protected String nome;
    protected double preco;

    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "ItemMenu: " + nome + " | Preço: R$ " + preco;
    }
}

class Sobremesa extends ItemMenu {
    protected boolean contemAcucar;

    public Sobremesa(String nome, double preco, boolean contemAcucar) {
        super(nome, preco);
        this.contemAcucar = contemAcucar;
    }

    @Override
    public String toString() {
        return super.toString().replace("ItemMenu", "Sobremesa")
                + " | Contém açúcar: " + (contemAcucar ? "Sim" : "Nao");
    }
}
