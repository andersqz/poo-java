public class Ex10 {
    public static void main(String[] args) {
        
        Instrumento[] instrumentos = {
            new Violao(),
            new Piano(),
            new Instrumento()
        };

        for (Instrumento i : instrumentos) {
            i.tocar();
        }
    }
}

class Instrumento {

    public void tocar() {
        System.out.println("som generico");
    }
}

class Violao extends Instrumento {

    @Override
    public void tocar() {
        System.out.println("Tocando violao");
    }
}

class Piano extends Instrumento {

    @Override
    public void tocar() {
        System.out.println("Tocando piano");
    }
}
