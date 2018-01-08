public class PrintFooterDecorator implements Ticket {
    Ticket ticket;

    PrintFooterDecorator(Ticket ticket){
        this.ticket=ticket;
    }

    @Override
    public void print() {
        ticket.print();
        System.out.println("Footer");
    }
}
