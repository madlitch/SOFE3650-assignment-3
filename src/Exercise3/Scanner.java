package Exercise3;

public class Scanner {
    private final CashRegister cashRegister;

    public Scanner(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
    public void scannedUPCCode(long UPCCode) {
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}