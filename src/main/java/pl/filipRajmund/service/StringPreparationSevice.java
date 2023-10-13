package pl.filipRajmund.service;

import pl.filipRajmund.domain.User;

public class StringPreparationSevice {
    public String prepare(final User user){
        return String.format("%s:%s", user.getBirthDate(),user.getEmail());
    }
}
