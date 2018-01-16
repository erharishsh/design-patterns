import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintInvoker {
    Map<String,PrintCommand> commandMap=new HashMap<>();
    ArrayList<PrintCommand> stack=new ArrayList<>();

    void setCommand(String commandString,PrintCommand command){
        commandMap.put(commandString,command);
    }


    void performClick(String commandString){
        PrintCommand command=commandMap.get(commandString);
        stack.add(command);
        command.print();
    }

    void undoOperation(){
        stack.get(stack.size()-1).undo();
        stack.remove(stack.size()-1);
    }


}
