class SnowRunner {

    public static void main(String[] args) {

        Snow snow1 = new Snow();
        System.out.println("Snow 1");
        System.out.println("Type: " + snow1.type);
        System.out.println("Snowfall: " + snow1.snowfall);
        System.out.println("Season: " + snow1.season);
        System.out.println("With Wind: " + snow1.withWind);
        System.out.println("Temperature: " + snow1.temperature);
        System.out.println("=========================\n");

        Snow snow2 = new Snow("Light Snow");
        System.out.println("Snow 2");
        System.out.println("Type: " + snow2.type);
        System.out.println("Snowfall: " + snow2.snowfall);
        System.out.println("Season: " + snow2.season);
        System.out.println("With Wind: " + snow2.withWind);
        System.out.println("Temperature: " + snow2.temperature);
        System.out.println("00000000000000000000000000000");

        Snow snow3 = new Snow("Moderate Snow", 15.5);
        System.out.println("Snow 3");
        System.out.println("Type: " + snow3.type);
        System.out.println("Snowfall: " + snow3.snowfall);
        System.out.println("Season: " + snow3.season);
        System.out.println("With Wind: " + snow3.withWind);
        System.out.println("Temperature: " + snow3.temperature);
        System.out.println("11111111111111111111111111111111111");

        Snow snow4 = new Snow("Heavy Snow", 30.0, "Winter");
        System.out.println("Snow 4");
        System.out.println("Type: " + snow4.type);
        System.out.println("Snowfall: " + snow4.snowfall);
        System.out.println("Season: " + snow4.season);
        System.out.println("With Wind: " + snow4.withWind);
        System.out.println("Temperature: " + snow4.temperature);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Snow snow5 = new Snow("Blizzard", 60.0, "Winter", true);
        System.out.println("Snow 5");
        System.out.println("Type: " + snow5.type);
        System.out.println("Snowfall: " + snow5.snowfall);
        System.out.println("Season: " + snow5.season);
        System.out.println("With Wind: " + snow5.withWind);
        System.out.println("Temperature: " + snow5.temperature);
        System.out.println("=========================");

        Snow snow6 = new Snow("Snowstorm", 80.0, "Winter", true, -5);
        System.out.println("Snow 6");
        System.out.println("Type: " + snow6.type);
        System.out.println("Snowfall: " + snow6.snowfall);
        System.out.println("Season: " + snow6.season);
        System.out.println("With Wind: " + snow6.withWind);
        System.out.println("Temperature: " + snow6.temperature);
        System.out.println("=========================");
    }
}