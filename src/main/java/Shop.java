
import behaviours.ISell;
import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int getItemsInStock() {
        return this.stock.size();
    }

    public void addItem(ISell item) {
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

   
}

