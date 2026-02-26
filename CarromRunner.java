class CarromRunner {

    public static void main(String[] args) {

        Carrom c1 = new Carrom();
        System.out.println("Carrom 1");
        System.out.println("Brand: " + c1.brand);
        System.out.println("Board Size: " + c1.boardSize);
        System.out.println("Wood Type: " + c1.woodType);
        System.out.println("With Stand: " + c1.withStand);
        System.out.println("Price: " + c1.price);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        Carrom c2 = new Carrom("Synco");
        System.out.println("Carrom 2");
        System.out.println("Brand: " + c2.brand);
        System.out.println("Board Size: " + c2.boardSize);
        System.out.println("Wood Type: " + c2.woodType);
        System.out.println("With Stand: " + c2.withStand);
        System.out.println("Price: " + c2.price);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Carrom c3 = new Carrom("Precise", 29.0);
        System.out.println("Carrom 3");
        System.out.println("Brand: " + c3.brand);
        System.out.println("Board Size: " + c3.boardSize);
        System.out.println("Wood Type: " + c3.woodType);
        System.out.println("With Stand: " + c3.withStand);
        System.out.println("Price: " + c3.price);
        System.out.println("#############################");

        Carrom c4 = new Carrom("Surco", 32.0, "Plywood");
        System.out.println("Carrom 4");
        System.out.println("Brand: " + c4.brand);
        System.out.println("Board Size: " + c4.boardSize);
        System.out.println("Wood Type: " + c4.woodType);
        System.out.println("With Stand: " + c4.withStand);
        System.out.println("Price: " + c4.price);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Carrom c5 = new Carrom("Champion", 35.0, "Birch Wood", true);
        System.out.println("Carrom 5");
        System.out.println("Brand: " + c5.brand);
        System.out.println("Board Size: " + c5.boardSize);
        System.out.println("Wood Type: " + c5.woodType);
        System.out.println("With Stand: " + c5.withStand);
        System.out.println("Price: " + c5.price);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        Carrom c6 = new Carrom("Premium", 36.0, "Teak Wood", true, 7500);
        System.out.println("Carrom 6");
        System.out.println("Brand: " + c6.brand);
        System.out.println("Board Size: " + c6.boardSize);
        System.out.println("Wood Type: " + c6.woodType);
        System.out.println("With Stand: " + c6.withStand);
        System.out.println("Price: " + c6.price);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
}