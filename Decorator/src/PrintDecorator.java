public abstract class PrintDecorator implements Ticket{
    Ticket ticket;

    PrintDecorator(Ticket ticket){
        this.ticket=ticket;
    }

    @Override
    public void print() {
        ticket.print();
    }
}
