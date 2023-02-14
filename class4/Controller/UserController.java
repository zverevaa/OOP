package Controller;

import Model.Student;
import Model.User;
import Service.UserService;

import java.util.List;

public class UserController {
    private UserService userService = new UserService() {
        @Override
        public void add(User user) {

        }

        @Override
        public void remove(User user) {

        }

        @Override
        public void edit(User user, User updateUser) {

        }

        @Override
        public List getAllUsers() {
            return null;
        }
    };
    public void getStudentInfo(String name, float grade, int year){
        userService.add(new Student(name,grade,year));

    }
}
