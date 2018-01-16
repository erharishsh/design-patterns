public class Main {
    public static void main(String[] args) {

        PrintInvoker invoker=new PrintInvoker();

        PrintWelcomeTextCommand welcomeTextCommand=new PrintWelcomeTextCommand(new Text());
        PrintCircleCommand circleCommand=new PrintCircleCommand(new Circle());

        invoker.setCommand("text",welcomeTextCommand);
        invoker.setCommand("circle",circleCommand);


        invoker.performClick("text");
        invoker.performClick("circle");

        invoker.undoOperation();
        invoker.undoOperation();

    }
}
