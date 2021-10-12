package Exercise3;

public class Display extends Observer {

    public Display(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
        this.cashRegister.attachObserver(this);
    }

    @Override
    public void displayText(String text) {
        System.out.println("||||||||||||||||||||||||| Display |||||||||||||||||||||||||");
        System.out.println(text);
    }
}