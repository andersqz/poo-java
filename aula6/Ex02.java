
public class Ex02 {
    public static void main(String[] args) {
        
        Aluno student = new Aluno();
    
        System.out.println(student.nome);
        System.out.println(student.idade);
        System.out.println(student.getMatricula());
        
    }
}


class Pessoa {

    protected String nome = "Anderson";
    protected int idade = 21;
}

class Aluno extends Pessoa{
    private int matricula = 1125201408;

    public int getMatricula() {
        return matricula;
    }
}