import java.util.InputMismatchException;

public class HospitalTriagem {

    static void cadastrarPaciente(String nome, double peso){

        /*
        System.out.print("Digite o nome do paciente: ");
        String nome = in.nextLine();
        System.out.print("Digite o peso do paciente: ");
        double peso = in.nextDouble();
        in.nextLine();
        */

        // valida se tem espaços na borda da string ou se a string eh vazia
        // lança a exceção
        if (nome == null || nome.trim().isEmpty()) {
            throw new NullPointerException("Nome do paciente não pode ser vazio.");
        }

        // valida se peso eh menor que zero ou maior que 500kg
        // lança a exceção
        if (peso <= 0 || peso > 500) {
            throw new InputMismatchException("Peso inválido: " + peso + " kg.");
        }

        System.out.println("Paciente cadastrado: " + nome + " | " + peso + " kg");
    }

    static void parteA() {
        System.out.println("\n===== PARTE A: Multi-catch com | =====");

        try {
            cadastrarPaciente("", -5.0);

        } catch (NullPointerException | InputMismatchException e) {
            System.out.println("Dados inválidos: " + e.getMessage());
            System.out.println("Por favor, preencha a ficha novamente.");
        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }

    static void parteB() {
        System.out.println("\n===== PARTE B: Objeto nulo do banco =====");

        Paciente paciente = null;

        try {
            String plano
        }
    }
}