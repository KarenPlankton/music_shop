package instruments;

public abstract class Instrument {
    private String colour;
    private String material;

    public Instrument(String colour, String material) {
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }
}
