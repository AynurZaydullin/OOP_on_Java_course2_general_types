package pro.sky.java.course2.transport;

import java.io.IOException;
/*
Создание класса собственного проверяемого исключения.
 */
public class TransportTypeException extends IOException {
    private final String message;
    public TransportTypeException(String message) {
        super();
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
