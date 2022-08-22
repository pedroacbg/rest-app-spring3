package com.pedroacbg.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1L, "Hugo Abaporu", LocalDate.now().minusYears(30)));
        users.add(new User(2L, "Togo Zado", LocalDate.now().minusYears(25)));
        users.add(new User(3L, "Sandro Chico", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(Long id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().get();
    }

}
