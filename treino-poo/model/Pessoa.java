package model;

import java.sql.SQLOutput;

public abstract class Pessoa {

    private String nome;
    private String email;
    private String dataNascimento;

    public Pessoa() {}

    public Pessoa(String nome, String email, String data) {
        setNome(nome);
        setEmail(email);
        setDataNascimento(data);
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getDataNascimento() { return dataNascimento; }

    public void setNome(String value) {
        if (value == null || value.length() <= 0 || value.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        } else {
            this.nome = value;
        }
    }

    public void setEmail(String value) {
        if (value == null || value.isBlank() || value.length() <= 0) {
            throw new IllegalArgumentException("E-mail não pode ser vazio.");
        } else {
            this.email = value;
        }
    }

    public void setDataNascimento(String value) {
        if (value == null || value.length() <= 0 || value.isBlank()) {
            throw new IllegalArgumentException("Data de nascimento não pode ser vazio.");
        } else {
            this.dataNascimento = value;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " | Email: " + getEmail() + " | Nascimento: " + getDataNascimento();
    }
}
