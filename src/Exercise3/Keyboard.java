package Exercise3;

public class Keyboard {
    private final CashRegister cashRegister;

    public Keyboard(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }

    public void setUPCCode(long UPCCode){
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}