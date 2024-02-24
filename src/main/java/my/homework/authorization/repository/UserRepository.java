package my.homework.authorization.repository;

import my.homework.authorization.utilities.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final ConcurrentHashMap<String, List<Authorities>> users = new ConcurrentHashMap<>();

    public UserRepository() {
        var authoritiesPetya = new ArrayList<Authorities>();
        authoritiesPetya.add(Authorities.READ);
        registerNewUser("Petya", "123", authoritiesPetya);

        var authoritiesVasya = new ArrayList<Authorities>();
        authoritiesVasya.add(Authorities.READ);
        authoritiesVasya.add(Authorities.WRITE);
        authoritiesVasya.add(Authorities.DELETE);
        registerNewUser("Vasya", "456", authoritiesVasya);
    }

    public void registerNewUser(String name, String password, List<Authorities> authorities) {
        users.put(name + password, authorities);
    }

    public List<Authorities> getUserAuthorities(String name, String password) {
        var userAuthorities = new ArrayList<Authorities>();
        if (users.get(name + password) != null) {
            userAuthorities.addAll(users.get(name + password));
        }
        return userAuthorities;
    }
}
