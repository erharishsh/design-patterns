public class BrownBread extends Bread{

    BreadDetails breadDetails;

    BrownBread(){
        breadType=BreadType.BROWN.getType();
        breadDetails=new BreadDetails();

        bakingTemperature=breadDetails.getBakingTemperature(breadType,Temperature.CELCIUS);
        proteinPerGram=breadDetails.getProtienPerGram(breadType);
        caloriesPerGram=breadDetails.getCaloriesPerGram(breadType);

    }

    @Override
    String getDetails() {
        return "Bread Type :"+breadType+
                "\n Baking Temperature :"+bakingTemperature+
                "\n Protien :"+proteinPerGram+
                "\n Calories :"+caloriesPerGram;
    }
}
