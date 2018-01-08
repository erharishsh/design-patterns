public class PrintBorderDecorator extends PrintDecorator {
    PrintBorderDecorator(Ticket ticket) {
        super(ticket);
    }

    @Override
    public void print() {
        System.out.println("Border");
        super.print();
    }
}
