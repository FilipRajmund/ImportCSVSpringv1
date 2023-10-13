package pl.filipRajmund.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.filipRajmund.domain.User;

import java.util.Comparator;
import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class DataProcessingService {
    private final StringPreparationSevice stringPreparationSevice;
    public List<String> process(final List<User> users){
        return users.stream()
                .sorted(Comparator.comparing(User::getBirthDate))
                .map(user->stringPreparationSevice.prepare(user))
                .peek(line->log.info("Prepared line: [{}]",line))
                .toList();

    }
}
