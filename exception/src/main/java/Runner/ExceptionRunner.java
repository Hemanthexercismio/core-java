package Runner;

import com.frozen.exception.Exceptions;
import com.frozen.exception.InvalidAgeException;

public class ExceptionRunner {
    public static void main(String[] args) {
        Exceptions ref=new Exceptions();
        System.out.println("before method  execution");

        try {
            ref.checkAge(17);
            System.out.println("after method  execution");
        } catch (InvalidAgeException e) {
            System.out.println("Exception handled");
            throw new RuntimeException(e);
        }
    }
}
