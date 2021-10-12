package Exercise2;

public class Scanner {
    private final CashRegister cashRegister = new CashRegister();

    public void scannedUPCCode(long UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}