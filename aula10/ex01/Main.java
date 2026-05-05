package aula10.ex01;

import aula10.ex01.exceptions.CargaInvalidaException;
import aula10.ex01.exceptions.CombustivelInsuficienteException;
import aula10.ex01.model.NaveCargueiro;
import aula10.ex01.model.NaveCombate;
import aula10.ex01.model.NaveEspacial;
import aula10.ex01.model.NaveExploracao;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NaveEspacial> frota = new ArrayList<>();

        NaveCargueiro cargueiro = new NaveCargueiro("Cargueiro-Alpha", 5000.0, 200.0, 1500.0, 8000.0);
        NaveCombate combate = new NaveCombate("Falcao-Negro", 3000.0, 400.0, 6, true);
        NaveExploracao exploracao = new NaveExploracao("Pioneiro-VII", 4000.0, 350.0, true);

        frota.add(cargueiro);
        frota.add(combate);
        frota.add(exploracao);

        try {
            cargueiro.setPesoCargaAtual(99999.0);
        } catch (CargaInvalidaException e) {
            System.out.println("Erro de carga: " + e.getMessage());
        }

        System.out.println();

        for (NaveEspacial nave : frota) {
            System.out.println("Tipo: " + nave.getClass().getSimpleName() + " | Identificador: " + nave.getIdentificador());
            try {
                nave.viajar(1000);
            } catch (CombustivelInsuficienteException e) {
                System.out.println("Erro de viagem: " + e.getMessage());
            }
        }
    }
}
