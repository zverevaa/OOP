package Service;

import Model.Student;
import Model.User;

import java.util.List;

public interface UserService{
    void add(User user);

    void remove(User user);

    void edit(User user, User update);

    List getAllUsers();
}
