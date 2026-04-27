package aula7.HospitalTriagem.repository;

import java.util.ArrayList;
import java.util.List;
import Ex01.model.Paciente;

public class PacienteRepository {
    
    final List<Paciente> list = new ArrayList<>();

    public void cadastrar(Paciente p) {
        list.add(p);
    }

    public void listar() {
        for (Paciente p : list) {
            System.out.println(p);
        }
    }

    
}
