package pl.filipRajmund.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pl.filipRajmund.domain.User;
import java.util.List;

@Slf4j
@Repository
public class DataRepository {

    //metoda tworzy liste userow z dostarczongo pliku
    public List<User> readCSV() {

    }

    //metoda zapisuje listę pliku
    public void saveTofile(final List<String> processed) {

    }
}
