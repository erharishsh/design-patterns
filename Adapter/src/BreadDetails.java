enum Temperature {CELCIUS, FARENHIET};

public class BreadDetails {

    int getProtienPerGram(String breadType) {
        switch (breadType) {

            case "white":
                return 10;
            case "brown":
                return 20;
            case "multigrain":
                return 50;
        }
        return 0;
    }


    int getCaloriesPerGram(String breadType) {
        switch (breadType) {

            case "white":
                return 100;
            case "brown":
                return 200;
            case "multigrain":
                return 500;
        }
        return 0;
    }

    int getBakingTemperature(String breadType, Temperature tempType) {
        if (tempType == Temperature.CELCIUS) {
            switch (breadType) {
                case "white":
                    return 100;
                case "brown":
                    return 200;
                case "multigrain":
                    return 500;
            }
        } else if(tempType==Temperature.FARENHIET) {
            switch (breadType) {
                case "white":
                    return 140;
                case "brown":
                    return 270;
                case "multigrain":
                    return 540;
            }
        }
        return 0;
    }

}
