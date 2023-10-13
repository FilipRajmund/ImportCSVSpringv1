package pl.filipRajmund;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.filipRajmund.configuration.AplicationConfiguration;
import pl.filipRajmund.service.DataProcessingService;
import pl.filipRajmund.service.DataRepository;
import pl.filipRajmund.service.MainProcessor;
import pl.filipRajmund.service.StringPreparationSevice;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(AplicationConfiguration.class);
        MainProcessor mainProcessor = context.getBean(MainProcessor.class);

        // MainProcessor mainProcessor =new MainProcessor(new DataRepository(),new DataProcessingService(new StringPreparationSevice()));
        mainProcessor.calculate();

    }
}