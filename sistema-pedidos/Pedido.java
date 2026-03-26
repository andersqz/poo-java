// +---------------------------+
//|          Pedido           |
//+---------------------------+
//| - itens: List<ItemPedido> |
//+---------------------------+
//| +adicionarItem()          |
//| +removerItem()            |
//| +calcularTotal(): double  |
//+---------------------------+


class Pedido {
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total = total + item.produto.getSubtotal();
        }
        return total;
    }
}