package Runner;

import com.frozen.customexception.CustomUnchecked;
import com.frozen.customexception.InvaliedAgeException;

public class CustomUncheckedRunner {
    public static void main(String[] args) {
        try{

        CustomUnchecked.Agecheck(15);

    } catch (InvaliedAgeException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
}
