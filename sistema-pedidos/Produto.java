//+-------------------+
//|     Produto       |
//+-------------------+
//| - nome: String    |
//| - preco: double   |
//+-------------------+
//| +getNome()        |
//| +getPreco()       |
//| +setNome()        |
//| +setPreco()       |
//+-------------------+

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}