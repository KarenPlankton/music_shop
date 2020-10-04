package instruments;

public class MusicBook extends OtherItems {
    String title;

    public MusicBook(String title, double buyPrice, double sellPrice) {
        super(buyPrice, sellPrice);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}