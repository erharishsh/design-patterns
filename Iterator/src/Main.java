import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MessageCollection collection=new MessageCollection();
        collection.addMessage(new Message("abc"));
        collection.addMessage(new Message("abcd"));
        collection.addMessage(new Message("abcde"));
        collection.addMessage(new Message("abcdef"));


        Iterator<Message> iterator=collection.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getContent());
        }

        /*Message[] messages=collection.getMessages();

        for (int i=0;i<messages.length;i++){
            if(messages[i]==null)
                break;
            System.out.println(i+". "+messages[i].getContent());
        }*/


        MessageCollectionWithList collection1=new MessageCollectionWithList();
        collection1.addMessage(new Message("1"));
        collection1.addMessage(new Message("12"));
        collection1.addMessage(new Message("123"));
        collection1.addMessage(new Message("1234"));


        Iterator<Message> iterator1=collection1.getIterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next().getContent());
        }

       /* ArrayList<Message> messages=collection1.getMessages();

        for (int i=0;i<messages.size();i++){

            System.out.println(i+". "+messages.get(i).getContent());
        }*/


    }
}
