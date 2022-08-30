package ru.yaya.boot.Boot.service;




import ru.yaya.boot.Boot.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}