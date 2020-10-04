package instruments;

public abstract class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(String colour, String material, int numberOfStrings) {
        super(colour, material);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
