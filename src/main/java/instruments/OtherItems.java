package instruments;



import behaviours.ISell;

public abstract class OtherItems implements ISell {
    protected double buyPrice;
    protected double sellPrice;

    public OtherItems(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

//    public interface ISell {
//        int calculateMarkup();
//    }
}

