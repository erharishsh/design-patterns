import java.io.*;

public class Main {

    public static void main(String[] args) {
        Ticket ticket=new ComplainTicket();

         new PrintFooterDecorator(new PrintHeaderDecorator(ticket)).print();

        try {


            new LineNumberInputStream(new BufferedInputStream(new FileInputStream(new File("asdf"))));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
