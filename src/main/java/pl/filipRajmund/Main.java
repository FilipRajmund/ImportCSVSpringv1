package pl.filipRajmund;

import pl.filipRajmund.service.DataProcessingService;
import pl.filipRajmund.service.DataRepository;
import pl.filipRajmund.service.MainProcessor;
import pl.filipRajmund.service.StringPreparationSevice;

public class Main {
    public static void main(String[] args) {
        MainProcessor mainProcessor =new MainProcessor(new DataRepository(),new DataProcessingService(new StringPreparationSevice()));
        mainProcessor.calculate();

    }
}