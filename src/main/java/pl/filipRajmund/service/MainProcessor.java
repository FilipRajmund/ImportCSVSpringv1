package pl.filipRajmund.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.filipRajmund.domain.User;

import java.util.List;

@AllArgsConstructor
public class MainProcessor {
    private final DataRepository dataRepository;
    private final DataProcessingService dataProcessingService;

    public void calculate(){
    List<User> users = dataRepository.readCSV();
    List<String> processed = dataProcessingService.process(users);
    dataRepository.saveTofile(processed);

    }



}
