import java.util.ArrayList;

public class MessageCollectionWithList implements Collection {

    ArrayList<Message> messages = new ArrayList<>();

    void addMessage(Message message) {
        messages.add(message);
    }

    ArrayList<Message> getMessages() {
        return messages;
    }

    @Override
    public Iterator<Message> getIterator() {
        return new MessageCollectionListIterator(messages);
    }

}
