package Runner;

import com.frozen.exception.UncheckedEvent;

public class UncheckedExcRunner {
    public static void main(String[] args) {
        UncheckedEvent ref=new UncheckedEvent();
        try {
            ref.event("hemanth");

        } catch (NullPointerException e) {
            System.out.println("Exception handled" + e.getMessage());
            System.out.println("after method execution");
        }
    }
}
