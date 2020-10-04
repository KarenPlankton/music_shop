package instruments;

public abstract class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String colour, String material, int numberOfValves) {
        super(colour, material);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}