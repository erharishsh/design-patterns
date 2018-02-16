public class WhiteBread extends Bread{

    BreadDetails breadDetails;

    WhiteBread(){
        breadType=BreadType.WHITE.getType();
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
