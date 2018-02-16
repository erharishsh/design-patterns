public class MessageCollection implements Collection {

    Message[] messages=new Message[50];
    int count;

    void addMessage(Message message){
        messages[count++]=message;
    }

    Message[] getMessages(){
     return messages;
    }

    @Override
    public Iterator getIterator() {
        return new MessageCollectionIterator<Message>(messages);
    }
}
