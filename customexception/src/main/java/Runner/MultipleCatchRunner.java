package Runner;

public class MultipleCatchRunner {
    public static void main(String[] args) {
     /*  try{
            String name=null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }*/
        try {
Class.forName("com.frozen.customexception.CustomUnche");
            int[] num = {2, 3, 4, 5};
            System.out.println(num[6]);
            String name = null;
            System.out.println(name.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                    System.out.println(e.getMessage());
                } catch (ClassNotFoundException e) {
            System.out.println("exception in running program " +e.getMessage());
        throw new RuntimeException(e);
    }

    }
}
