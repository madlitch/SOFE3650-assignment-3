package Exercise2;

public class CashRegister {
    private final Display display = new Display();
    private final TicketPrinter ticketPrinter = new TicketPrinter();
    private Product currentProduct;
    private final ProductDB productDB = new ProductDB();
    private long UPCCode;

    public void setCurrentProductUPC(long UPCCode) {
        this.UPCCode = UPCCode;
        this.currentProduct = this.getCurrentProductInfo();

        if (this.currentProduct != null) {
            this.display.displayProduct(this.currentProduct);
            this.ticketPrinter.displayProduct(this.currentProduct);
        }
    }

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}