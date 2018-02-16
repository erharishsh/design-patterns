import java.util.ArrayList;

public class MessageCollectionListIterator<T> implements Iterator<T> {
    ArrayList<T> messages;
    int pos;

    MessageCollectionListIterator(ArrayList<T> messages) {
        this.messages = messages;
    }

    @Override
    public T next() {
        return messages.get(pos++);
    }

    @Override
    public boolean hasNext() {
        if (pos == (messages.size()))
            return false;
        return true;
    }
}
