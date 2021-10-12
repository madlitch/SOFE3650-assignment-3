package Exercise3;

public class TicketPrinter extends Observer {

    public TicketPrinter(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
        this.cashRegister.attachObserver(this);
    }

    @Override
    public void displayText(String text) {
        System.out.println("||||||||||||||||||||||||| Ticket Printer |||||||||||||||||||||||||");
        System.out.println(text);
    }
}

