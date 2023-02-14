package Service.impls;

import Model.User;
import Repository.UserRepository;
import Service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository<User> repository = new UserRepository();

    @Override
    public void add(User user) {
        if (user != null) {
            repository.save(user);
        } else {
            System.out.println("User is null!");
        }


    }

    @Override
    public void remove(User user) {
        if (user != null){
            repository.remove(user);
        }


    }

    @Override
    public void edit(User user, User updateUser) {
        List<User> users = repository.getAllUsers();
        if (users.contains(user)) {
            users.remove(user);
            users.add(updateUser);
        }
    }

    @Override
    public List getAllUsers() {
        return repository.getAllUsers();
    }
}
