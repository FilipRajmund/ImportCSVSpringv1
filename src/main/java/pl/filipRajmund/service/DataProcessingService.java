package pl.filipRajmund.service;

import lombok.AllArgsConstructor;
import pl.filipRajmund.domain.User;

import java.util.List;

@AllArgsConstructor
public class DataProcessingService {
    private final StringPreparationSevice stringPreparationSevice;
    public List<String> process(final List<User> user){

    }
}
