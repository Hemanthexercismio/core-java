class RainRunner {

    public static void main(String[] args) {

        Rain rain1 = new Rain();
        System.out.println("Rain 1");
        System.out.println("Type: " + rain1.type);
        System.out.println("Rainfall: " + rain1.rainfall);
        System.out.println("Season: " + rain1.season);
        System.out.println("With Thunder: " + rain1.withThunder);
        System.out.println("Duration: " + rain1.duration);
        System.out.println("...........................");

        Rain rain2 = new Rain("Drizzle");
        System.out.println("Rain 2");
        System.out.println("Type: " + rain2.type);
        System.out.println("Rainfall: " + rain2.rainfall);
        System.out.println("Season: " + rain2.season);
        System.out.println("With Thunder: " + rain2.withThunder);
        System.out.println("Duration: " + rain2.duration);
        System.out.println("//////////////////////////////");

        Rain rain3 = new Rain("Heavy", 45.5);
        System.out.println("Rain 3");
        System.out.println("Type: " + rain3.type);
        System.out.println("Rainfall: " + rain3.rainfall);
        System.out.println("Season: " + rain3.season);
        System.out.println("With Thunder: " + rain3.withThunder);
        System.out.println("Duration: " + rain3.duration);
        System.out.println("*****************************");

        Rain rain4 = new Rain("Moderate", 30.0, "Monsoon");
        System.out.println("Rain 4");
        System.out.println("Type: " + rain4.type);
        System.out.println("Rainfall: " + rain4.rainfall);
        System.out.println("Season: " + rain4.season);
        System.out.println("With Thunder: " + rain4.withThunder);
        System.out.println("Duration: " + rain4.duration);
        System.out.println("=========================");

        Rain rain5 = new Rain("Thunderstorm", 60.0, "Summer", true);
        System.out.println("Rain 5");
        System.out.println("Type: " + rain5.type);
        System.out.println("Rainfall: " + rain5.rainfall);
        System.out.println("Season: " + rain5.season);
        System.out.println("With Thunder: " + rain5.withThunder);
        System.out.println("Duration: " + rain5.duration);
        System.out.println("=========================");

        Rain rain6 = new Rain("Cloudburst", 120.0, "Monsoon", true, 90);
        System.out.println("Rain 6");
        System.out.println("Type: " + rain6.type);
        System.out.println("Rainfall: " + rain6.rainfall);
        System.out.println("Season: " + rain6.season);
        System.out.println("With Thunder: " + rain6.withThunder);
        System.out.println("Duration: " + rain6.duration);
        System.out.println("=========================");
    }
}