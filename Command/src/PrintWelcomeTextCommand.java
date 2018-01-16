public class PrintWelcomeTextCommand implements PrintCommand {
   Text text;

   PrintWelcomeTextCommand(Text text){
       this.text=text;
   }

    @Override
    public void print() {
        text.writeText("Here is the welcome Text");
    }

    @Override
    public void undo() {
        text.erase();
    }
}
