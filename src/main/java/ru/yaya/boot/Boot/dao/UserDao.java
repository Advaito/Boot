package ru.yaya.boot.Boot.dao;




import ru.yaya.boot.Boot.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}