package Exercise1;

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
            this.display.displayText(this.currentProduct.toString());
            this.ticketPrinter.displayText(this.currentProduct.toString());
        }
    }

    public Product getCurrentProductInfo() {
        currentProduct = this.productDB.GetProductInfo(this.UPCCode);
        return currentProduct;
    }
}