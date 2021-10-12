package Exercise2;

public class Keyboard {
    private final CashRegister cashRegister = new CashRegister();

    public void setUPCCode(long UPCCode){
        this.cashRegister.setCurrentProductUPC(UPCCode);
    }
}