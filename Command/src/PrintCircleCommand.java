public class PrintCircleCommand implements PrintCommand {

    Circle circle;

    PrintCircleCommand(Circle circle){
        this.circle=circle;
    }

    @Override
    public void print() {
        circle.drawCircle();
        circle.fillCircle();
    }

    @Override
    public void undo() {
        circle.erase();
    }
}
