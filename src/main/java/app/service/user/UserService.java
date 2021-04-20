package app.service.user;

import app.model.User;

import java.util.List;

public interface UserService {
    void create(User user);
    List<User> getAll();
    User get(long id);
    void update(User user);
    void delete(long id);
}
