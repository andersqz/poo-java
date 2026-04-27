package aula7.HospitalTriagem.service;

import java.util.InputMismatchException;

import Ex01.model.Paciente;
import Ex01.repository.PacienteRepository;


public class PacienteService {

    public PacienteRepository repository = new PacienteRepository();
    
    public Paciente cadastrarPaciente(Paciente p) {

        if (p.getNome() == null || p.getNome().isBlank() || p.getNome().length() < 8)
            throw new IllegalArgumentException("Nome não pode ser vazio.");

        else if (p.getPlano() == null  || p.getPlano().isBlank())
            throw new IllegalArgumentException("Plano de saude não pode ser vazio.");

        else if (p.getPeso() > 500.00 || p.getPeso() < 1.0)
            throw new InputMismatchException("Entre com um peso válido");

        else
            repository.cadastrar(p);
        return p;
    }

    public void listarPaciente() {
        repository.listar();
    }
}
