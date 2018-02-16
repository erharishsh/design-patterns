enum BreadType {
    WHITE("white"),
    BROWN("brown"),
    MULTIGRAIN("multigrain");

    String type;
    BreadType(String type){
        this.type=type;
    }

    public String getType(){
        return type;
    }
}

public abstract class Bread {
    int bakingTemperature;
    int proteinPerGram;
    int caloriesPerGram;

    String breadType;

    abstract String getDetails();

}
