class Rain {

    String type;
    double rainfall;
    String season;
    boolean withThunder;
    int duration;

    Rain() {
    }

    Rain(String type) {
        this.type = type;
    }

    Rain(String type, double rainfall) {
        this.type = type;
        this.rainfall = rainfall;
    }

    Rain(String type, double rainfall, String season) {
        this.type = type;
        this.rainfall = rainfall;
        this.season = season;
    }

    Rain(String type, double rainfall, String season, boolean withThunder) {
        this.type = type;
        this.rainfall = rainfall;
        this.season = season;
        this.withThunder = withThunder;
    }

    Rain(String type, double rainfall, String season, boolean withThunder, int duration) {
        this.type = type;
        this.rainfall = rainfall;
        this.season = season;
        this.withThunder = withThunder;
        this.duration = duration;
    }
}