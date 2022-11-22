package homework3_3.service.serviceforoptions;

import homework3_3.car.Car;
import homework3_3.components.option.Options;


import java.util.Set;


public class ServiceForOptions {

    public void addOption(Car car, Options option) throws SuchOptionAlreadyExists, NoSuchOptionException {
        Set<Options> options = car.getOptions();
        for (Options variableForReadingOptions : options ) {
            if (variableForReadingOptions == null) {
                variableForReadingOptions = option;
                break;
            } else if(variableForReadingOptions == option){
                throw new SuchOptionAlreadyExists("Such option already exists");
            }
        }
        throw new NoSuchOptionException("It's not available to add such option, because such option doesn't exist");
    }


    public void deleteOption(Car car, Options option) throws NoSuchOptionException {
        Set<Options> options = car.getOptions();
        for (Options variableForReadingOptions : options) {
            if (variableForReadingOptions.equals(option)) {
                variableForReadingOptions = null;
                break;
            }
        }
        throw new NoSuchOptionException("It's not available to delete such option, because such option doesn't exist");
    }
}

/*protected Car addOption(Car car, String option) {
        String[] options = car.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] == null) {
                options[i] = option;
                break;
            } else {
                System.out.println("Невозможно добавить опцию");
            }
            car.setOptions(options);
        }
        return car;
    }*/
