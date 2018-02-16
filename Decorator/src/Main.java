import java.io.*;

public class Main {

    public static void main(String[] args) {
        Ticket ticket=new ComplainTicket();

         new PrintFooterDecorator(new PrintHeaderDecorator(ticket)).print();

    }
}
