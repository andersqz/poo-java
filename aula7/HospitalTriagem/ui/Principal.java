package aula7.HospitalTriagem.ui;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
import Ex01.model.Paciente;
import Ex01.service.*;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PacienteService service = new PacienteService();

        char opcao;

        do {

            System.out.println("SISTEMA DE TRIAGEM");
            System.out.println("1 - Cadastro de Paciente");
            System.out.println("2 - Lista de Pacientes");
            System.out.println("3 - Sair ...");
            System.out.print("Opção: ");
            opcao = sc.next().charAt(0);
            sc.nextLine();

            switch (opcao) {

                case '1':
                    try {
                        System.out.println("CADASTRO DE PACIENTE");
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Plano de saúde: ");
                        String plano = sc.nextLine();

                        System.out.print("Peso: ");
                        double peso = sc.nextDouble();
                        sc.nextLine();

                        Paciente p = new Paciente(nome, plano, peso);
                        service.cadastrarPaciente(p);
                        System.out.println("Paciente cadastrado com sucesso!");
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } 
                    finally {
                        System.out.println("Finally executado!");
                    }
                    break;
                
                case '2':
                    System.out.println("LISTA DE PACIENTES");
                    service.listarPaciente();  
                    break; 

                case '3':
                    System.out.println("Saindo ...");
                    break;

                default:
                    System.out.println("Entrada invalida.");
                    break;
            }
        } while (opcao != '3');
        sc.close();
    }
}
