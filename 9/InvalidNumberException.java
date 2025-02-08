// InvalidNumberException.java
public class InvalidNumberException extends Exception {
    private String invalidValue;
    private int lineNumber;

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException(String message, String invalidValue, int lineNumber) {
        super(message + " Значение: " + invalidValue + ", Строка: " + lineNumber);
        this.invalidValue = invalidValue;
        this.lineNumber = lineNumber;
    }

    public String getInvalidValue() {
        return invalidValue;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
