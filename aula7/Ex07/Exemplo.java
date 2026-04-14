import java.util.InputMismatchException;

// ===== CLASSE PACIENTE =====
// Encapsula os dados — princípio de encapsulamento (OOP)
class Paciente {
    private String nome;
    private double peso;
    private String planoDeSaude; // pode ser null — paciente sem plano

    public Paciente(String nome, double peso, String planoDeSaude) {
        this.nome = nome;
        this.peso = peso;
        this.planoDeSaude = planoDeSaude;
    }

    // Getters — convenção Java: getAtributo() com letra minúscula
    // Em C# seria: public string Nome { get; set; } (propriedade)
    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public String getPlanoDeSaude() { return planoDeSaude; }
}

// ===== CLASSE PRINCIPAL =====
public class HospitalTriagem {

    // ----- MÉTODO DE CADASTRO -----
    // "static" aqui significa que não precisa instanciar a classe para chamar
    // É como um método estático em C# (static void CadastrarPaciente(...))
    static void cadastrarPaciente(String nome, double peso) {

        // Validação de nome — lança NullPointerException manualmente
        // O professor chama isso de "Fail-Fast": detectar e falhar rápido
        if (nome == null || nome.trim().isEmpty()) {
            // "throw new" instancia e lança — igual em C#
            throw new NullPointerException("Nome do paciente não pode ser vazio.");
        }

        // Validação de peso — lança InputMismatchException manualmente
        if (peso <= 0 || peso > 500) {
            throw new InputMismatchException("Peso inválido: " + peso + " kg.");
        }

        System.out.println("Paciente cadastrado: " + nome + " | " + peso + " kg");
    }

    // ----- PARTE A: Multi-catch Java 7+ -----
    static void parteA() {
        System.out.println("\n===== PARTE A: Multi-catch com | =====");

        try {
            cadastrarPaciente("", -5); // nome vazio vai lançar NullPointerException

        } catch (NullPointerException | InputMismatchException e) {
            // Sintaxe Java 7+: "|" une dois tipos no mesmo bloco
            // Só use quando a ação corretiva for IDÊNTICA para ambos
            // A variável "e" funciona como o tipo comum dos dois (superclasse)
            System.out.println("Dados inválidos: " + e.getMessage());
            System.out.println("Por favor, preencha a ficha novamente.");

        } catch (Exception e) {
            // POLIMORFISMO: Exception é superclasse de todas as exceções
            // Este bloco captura qualquer erro que não seja NPE ou IME
            // "e" aqui pode referenciar qualquer objeto filho de Exception
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }

    // ----- PARTE B: NullPointerException em objeto nulo -----
    // Conforme slide do professor: NPE ocorre ao invocar método em referência nula
    static void parteB() {
        System.out.println("\n===== PARTE B: Objeto nulo do banco =====");

        // Simula retorno nulo de banco de dados
        // Em C# geraria NullReferenceException — em Java é NullPointerException
        Paciente paciente = null;

        try {
            // ERRO PROPOSITAL: acessar método de referência nula
            // A JVM não tem objeto em memória para chamar getPlanoDeSaude()
            String plano = paciente.getPlanoDeSaude(); // <- NPE aqui
            System.out.println("Plano: " + plano);

        } catch (NullPointerException e) {
            // Alerta de segurança do paciente — contexto hospitalar
            System.out.println("ALERTA DE SEGURANÇA: Dados do paciente não encontrados.");
            System.out.println("Acione o protocolo manual imediatamente.");
            System.out.println("Detalhe técnico: " + e.getMessage());
        }
    }

    // ----- PARTE C: ORDEM ERRADA — NÃO COMPILA -----
    // Demonstra o que o professor explica: catch(Exception) no topo esconde erros
    /*
    static void parteCErrada() {
        try {
            cadastrarPaciente(null, 70);

        } catch (Exception e) {
            // ❌ ERRO DE COMPILAÇÃO: Exception captura TUDO
            // Os blocos abaixo nunca seriam alcançados
            // Compilador Java acusa: "unreachable catch block"
            System.out.println("Erro genérico: " + e.getMessage());

        } catch (NullPointerException e) {
            // ❌ UNREACHABLE CODE — o compilador impede isso
            System.out.println("Nunca chegará aqui");
        }
    }
    */

    // ----- PARTE C CORRIGIDA: ordem correta -----
    static void parteCCorreta() {
        System.out.println("\n===== PARTE C: Ordem correta (específico → genérico) =====");

        try {
            cadastrarPaciente(null, 70); // null lança NullPointerException

        } catch (NullPointerException e) {
            // ✅ Mais específico PRIMEIRO — intercepta antes do genérico
            System.out.println("NPE capturada: " + e.getMessage());

        } catch (InputMismatchException e) {
            // ✅ Segundo específico
            System.out.println("Peso inválido capturado: " + e.getMessage());

        } catch (Exception e) {
            // ✅ GENÉRICO SEMPRE POR ÚLTIMO
            // Polimorfismo: qualquer filho de Exception cai aqui
            // se não foi capturado pelos blocos anteriores
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }

    // ----- MAIN -----
    public static void main(String[] args) {
        parteA();
        parteB();
        parteCCorreta();
    }
}