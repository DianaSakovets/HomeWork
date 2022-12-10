package homework3_3.service.serviceforoptions;

import homework3_3.car.Car;
import homework3_3.components.option.Options;


import java.util.Set;


public class ServiceForOptions {

    public static void addOption(Car car, Options option) {
        Set<Options> options = car.getOptions();
        for (Options variableForReadingOptions : options) {
            if (variableForReadingOptions == null) {
                variableForReadingOptions = option;
                break;
            } else {
                try {
                    if (variableForReadingOptions == option) {
                        throw new SuchOptionAlreadyExists("Such option already exists");
                    }
                } catch (SuchOptionAlreadyExists ex) {
                    ex.printStackTrace();
                }
            }
        }
        try {
            throw new NoSuchOptionException("It's not available to add such option, because such option doesn't exist");
        } catch (NoSuchOptionException ex) {
            ex.printStackTrace();
        }
    }


    public static void deleteOption(Car car, Options option) {
        Set<Options> options = car.getOptions();
        try {
            for (Options variableForReadingOptions : options) {
                if (variableForReadingOptions.equals(option)) {
                    variableForReadingOptions = null;
                    break;
                }
                throw new NoSuchOptionException("It's not available to delete such option, because such option doesn't exist");
            }
        } catch (NoSuchOptionException ex) {
            ex.printStackTrace();
        }
    }

}


