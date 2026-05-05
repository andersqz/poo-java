package aula10.ex01.exceptions;

public class CargaInvalidaException extends RuntimeException {
    public CargaInvalidaException(String message) {
        super(message);
    }
}
