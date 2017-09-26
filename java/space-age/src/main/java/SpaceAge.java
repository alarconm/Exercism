class SpaceAge {

    private double seconds;
    private final double EARTHSECONDS = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return seconds / EARTHSECONDS;
    }

    double onMercury() {
        return seconds / (EARTHSECONDS * 0.2408467);
    }

    double onVenus() {
        return seconds / (EARTHSECONDS * 0.61519726);
    }

    double onMars() {
        return seconds / (EARTHSECONDS * 1.8808158);
    }

    double onJupiter() {
        return seconds / (EARTHSECONDS * 11.862615);
    }

    double onSaturn() {
        return seconds / (EARTHSECONDS * 29.447498);
    }

    double onUranus() {
        return seconds / (EARTHSECONDS * 84.016846);
    }

    double onNeptune() {
        return seconds / (EARTHSECONDS * 164.79132);
    }

}
