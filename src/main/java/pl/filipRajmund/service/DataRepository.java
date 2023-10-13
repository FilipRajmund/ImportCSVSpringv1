package pl.filipRajmund.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import pl.filipRajmund.domain.User;

import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
public class DataRepository {

    //metoda tworzy liste userow z dostarczongo pliku
    public List<User> readCSV() {
        try {
            return Files.readAllLines(ResourceUtils.getFile("classpath:users.csv").toPath()).stream()
                    .map(line -> mapUser(line))
                    .filter(user-> user.isPresent())
                    .map(user->user.get())
                    .toList();

                    //.filter(user->user.isPresent())
        } catch (IOException ex) {
            log.error("Error reading users.csv");
            return List.of();
        }

    }

    private Optional<User> mapUser(String line) {
        if (!line.contains("@")) {
            return Optional.empty();
        }
        List<String> lineAsList = Arrays.asList(line.split(";"));
        return Optional.of(User.builder()
                .email(lineAsList.get(0))
                .name(lineAsList.get(1))
                .publicName(lineAsList.get(2))
                .birthDate(LocalDate.parse(lineAsList.get(3)))
                .build());

    }

    //metoda zapisuje listę pliku
    public void saveTofile(final List<String> processed) {

    }
}
