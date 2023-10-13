package pl.filipRajmund.service;

import org.springframework.stereotype.Service;
import pl.filipRajmund.domain.User;

@Service
public class StringPreparationSevice {
    public String prepare(final User user){
        return String.format("%s:%s", user.getBirthDate(),user.getEmail());
    }
}
