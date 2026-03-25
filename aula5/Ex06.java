public class Ex06 {
    public static void main(String[] args) {
        
        Usuario user = new Usuario("anderson.carvalho@gmail.com", "senha123");
        System.out.println("Email: " + user.getEmail()); 
        System.out.println("Senha: " + user.getSenha());

        user.setSenha("12345678");

        System.out.println("Email: " + user.getEmail()); 
        System.out.println("Senha: " + user.getSenha());

    }
}

class Usuario {
    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return "**********";
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
            System.out.println("Senha: " + getSenha());
        }
        else {
            System.out.println("A senha deve ter no mínimo 8 caracteres");
        }

    }
}
