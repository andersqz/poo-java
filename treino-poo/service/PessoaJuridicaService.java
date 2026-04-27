package service;

import model.Pessoa;
import model.PessoaJuridica;

public class PessoaJuridicaService {
    
    public boolean validaNome(PessoaJuridica p) {

        if (p.getNome() == null || p.getNome().trim().isEmpty() || p.getNome().length() < 8) {
            throw new NullPointerException("Nome do paciente não pode ser vazio.");
        } else {
            return true;
        }
}
