class Carrom {

    String brand;
    double boardSize;
    String woodType;
    boolean withStand;
    int price;

    Carrom(String brand, double boardSize, String woodType, boolean withStand, int price) {
        this.brand = brand;
        this.boardSize = boardSize;
        this.woodType = woodType;
        this.withStand = withStand;
        this.price = price;
    }

    Carrom(String brand, double boardSize, String woodType, boolean withStand) {
        this.brand = brand;
        this.boardSize = boardSize;
        this.woodType = woodType;
        this.withStand = withStand;
    }

    Carrom(String brand, double boardSize, String woodType) {
        this.brand = brand;
        this.boardSize = boardSize;
        this.woodType = woodType;
    }

    Carrom(String brand, double boardSize) {
        this.brand = brand;
        this.boardSize = boardSize;
    }

    Carrom(String brand) {
        this.brand = brand;
    }

    Carrom() {
    }
}