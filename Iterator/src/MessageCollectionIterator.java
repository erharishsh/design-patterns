public class MessageCollectionIterator<T> implements Iterator {
    T[] messages;
    int pos;

    MessageCollectionIterator(T[] messages){
        this.messages=messages;
    }

    @Override
    public Object next() {
        return messages[pos++];
    }

    @Override
    public boolean hasNext() {
        if(pos==(messages.length-1) || messages[pos]==null)
            return false;
        return true;
    }
}
