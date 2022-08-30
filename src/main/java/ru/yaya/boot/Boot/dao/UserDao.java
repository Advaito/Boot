package ru.yaya.boot.Boot.dao;




import ru.yaya.boot.Boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> index();
    User show(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}