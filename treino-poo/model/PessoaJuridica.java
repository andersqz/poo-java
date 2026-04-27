package model;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica() {}

    public PessoaJuridica(String nome, String email, String data, String cnpj) {
        super(nome, email, data);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String value) {

        if (value == null || value.length() < 14) {
            System.out.print("CNPJ inválido.");
        } else {
            this.cnpj = value;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | CNPJ: " + cnpj;
    }


}
