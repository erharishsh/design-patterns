public class PrintHeaderDecorator implements Ticket {
    Ticket ticket;

    PrintHeaderDecorator(Ticket ticket){
        this.ticket=ticket;
    }


    @Override
    public void print() {
        System.out.println("Header");
        ticket.print();
    }
}
