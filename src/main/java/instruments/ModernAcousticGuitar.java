package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import instruments.Guitar;
import instruments.GuitarType;

public class ModernAcousticGuitar extends Guitar implements IPlay, ISell {

    private GuitarType type;
    private double buyPrice;
    private double sellPrice;

    public ModernAcousticGuitar(String colour, String material, int numberOfStrings, double buyPrice, double sellPrice,GuitarType type) {
        super(colour, material, numberOfStrings);
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public GuitarType getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "Tommy Emmanuel";
    }

    public double calculateMarkup() {
        double profit = this.sellPrice - this.buyPrice;
        return profit;
    }
}