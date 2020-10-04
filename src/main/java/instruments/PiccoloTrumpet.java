package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class PiccoloTrumpet extends Trumpet implements IPlay, ISell {


    private double buyPrice;
    private double sellPrice;

    public PiccoloTrumpet(String colour, String material, int numberOfValves, double buyPrice, double sellPrice) {
        super(colour, material, numberOfValves);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;

    }


    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "Second Brandenburg Concerto";
    }

    public double calculateMarkup() {
        double profit = this.sellPrice - this.buyPrice;
        return profit;
    }



}
