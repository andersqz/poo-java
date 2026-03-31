
public class Ex01 {
    public static void main(String[] args) {

        Gato cat = new Gato();
        cat.emitirSom();

        Cachorro dog = new Cachorro();
        dog.emitirSom();
    }
}

class Animal {

    public void emitirSom() {
        System.out.println("SOM GENERICO");
    }
}

class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("miau");
    }
}


class Cachorro extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("au au");  
    }
}