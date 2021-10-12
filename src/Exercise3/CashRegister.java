package Exercise3;

import java.util.ArrayList;

public class CashRegister {
    private final ArrayList<Observer> observerList = new ArrayList<>();
    private Product currentProduct;
    private final ProductDB productDB = new ProductDB();
    private long UPCCode;

    public void setCurrentProductUPC(long UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();

        if (this.currentProduct != null) {
            notifyObservers(currentProduct.toString());
        } else {
            notifyObservers("Product with UPC " + this.UPCCode + " does not exist.");
        }
    }

    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    public void notifyObservers(String text) {
        for (Observer observer : observerList) {
            observer.displayText(text);
        }
    }

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}