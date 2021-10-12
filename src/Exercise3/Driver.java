package Exercise3;

public class Driver {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Scanner scanner = new Scanner(cashRegister);
        Keyboard keyboard = new Keyboard(cashRegister);
        new Display(cashRegister);
        new TicketPrinter(cashRegister);
        scanner.scannedUPCCode(124814870408L);
        scanner.scannedUPCCode(175822938297L);
        keyboard.setUPCCode(890958860785L);
    }
}