//+----------------------+
//|     ItemPedido       |
//+----------------------+
//| - produto: Produto   |
//| - quantidade: int    |
//+----------------------+
//| +getSubtotal():double|
//+----------------------+

class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return this.produto.getPreco() * this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}