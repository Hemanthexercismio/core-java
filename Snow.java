class Snow {

    String type;
    double snowfall;
    String season;
    boolean withWind;
    int temperature;

    Snow(String type, double snowfall, String season, boolean withWind, int temperature) {
        this.type = type;
        this.snowfall = snowfall;
        this.season = season;
        this.withWind = withWind;
        this.temperature = temperature;
    }

    Snow(String type, double snowfall, String season, boolean withWind) {
        this.type = type;
        this.snowfall = snowfall;
        this.season = season;
        this.withWind = withWind;
    }

    Snow(String type, double snowfall, String season) {
        this.type = type;
        this.snowfall = snowfall;
        this.season = season;
    }

    Snow(String type, double snowfall) {
        this.type = type;
        this.snowfall = snowfall;
    }

    Snow(String type) {
        this.type = type;
    }

    Snow() {
    }
}