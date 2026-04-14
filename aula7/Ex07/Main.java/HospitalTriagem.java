import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

class Paciente {
    private String nome;
    private double peso;
    private String planoDeSaude;

    // Método construtor
    public Paciente(String nome, double peso, String planoDeSaude) {
        this.nome = nome;
        this.peso = peso;
        this.planoDeSaude = planoDeSaude;
    }

    // getters
    public String getNome()         { return nome; }
    public double getPeso()         { return peso; }
    public String getPlanoDeSaude() { return planoDeSaude; }
}


public class HospitalTriagem {

    static ArrayList<Paciente> lista = new ArrayList<Paciente>();

    static void cadastrarPaciente(String nome, double peso, String planoDeSaude) {
        Paciente p = new Paciente(nome, peso, planoDeSaude);

        if (p.getNome() == null || getNome().trim().isEmpty()) {
            throw new NullPointerException("Nome do paciente não pode ser vazio.");
        }

        if (p.getPlanoDeSaude() == null || getPlanoDeSaude.trim().isEmpty()) {
            throw new NullPointerException("Nome do paciente não pode ser vazio.");
        }
        if (peso <= 0 || peso > 500) {
            throw new InputMismatchException("Peso inválido: " + p.getPeso());
        }

        lista.add(p);
        System.out.println("Paciente: " + p.getNome() + " | Peso: " + p.getPeso() + "kg");
    }

    static void Main() {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        System.out.println("Opção: ");
        opcao = scanner.nextInt();



        do {
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Sair");
            System.out.print("Opção: ");

            switch (opcao) {
                case 1:
                    System.out.println("\nCADASTRO DE PACIENTE");
                    System.out.print("Digite o nome do paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o peso do paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Digite o plano de saúde do paciente: ");
                    String planoDeSaude = scanner.nextLine();
                    scanner.nextLine();

                    try {
                        CadastrarPaciente(nome, peso, planoDeSaude);
                    } catch (Null.NullPointerException | InputMismatchException e) {
                        System.out.println("Dados inválidos: " + e.getMessage());
                        System.out.println("Por favor, preencha a ficha novamente.");
                    } catch (Exception e) {
                        System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
                    }
                    break;
                case 2:
                    
                    foreach (Paciente p in  lista) {
                        System.out.println(p + " \n");
                    }
                    break;
                default:
                    System.out.println("Entrada invalida.");
                    break;

                   

            }

        } while (opcao != 2);
    }

}