package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component

public interface UserDao {
    void save(User user);

    public List<User> listAll();
    public User get(Long id);

    public void delete(Long id);
}
