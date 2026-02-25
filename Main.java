class Main {
    public static void main(String[] args) {

        int x = 40;
        int y = 20;
        int choice = 2;
        int i;

        if (x > y)
            System.out.println("x is greater");

        if (x == y)
            System.out.println("both are equal");
        else
            System.out.println("not equal");

        if (x + y > 100)
            System.out.println("sum above 100");
        else if (x + y > 50)
            System.out.println("sum above 50");
        else if (x + y > 0)
            System.out.println("sum positive");
        else
            System.out.println("sum zero or negative");

        switch (choice) {
            case 1:
                System.out.println("result = " + (x + y));
                break;
            case 2:
                System.out.println("result = " + (x - y));
                break;
            case 3:
                System.out.println("result = " + (x * y));
                break;
            default:
                System.out.println("invalid choice");
        }

        System.out.println("for loop:");
        for (i = 0; i < 5; i++)
            System.out.print(i + " ");

        System.out.println("\nwhile loop:");
        i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\ndo while loop:");
        i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
    }
}