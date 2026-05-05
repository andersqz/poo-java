package aula10.ex02.exceptions;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException(String message) {
        super(message);
    }
}
