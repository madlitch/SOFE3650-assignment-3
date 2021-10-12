package Exercise3;

public class Product {
    private long UPCCode;
    private final String name;
    private final double price;

    public Product(long UPCCode, String name, double price){
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    public void setUPCCode(long UPCCode) {
        this.UPCCode = UPCCode;
    }

    public long getUPCCode() {
        return UPCCode;
    }

    @Override
    public String toString() {
        return "Product { " +
                "UPCCode: " + UPCCode +
                ", Name: '" + name + '\'' +
                ", Price: $" + String.format("%.2f", price) +
                " }";
    }
}