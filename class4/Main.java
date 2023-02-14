import Model.Student;
import Model.Teacher;
import Service.UserService;
import Service.impls.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        Teacher ivan = new Teacher("Ivan");
        Student john = new Student("John", 4.92f , 4);
        userService.add(ivan);
        userService.add(john);
//        userService.edit(john, ivan);

        System.out.println("Здравствуйте. Введите интересующий Вас вариант");
        System.out.println("1 - добавить пользователя");
        System.out.println("2 - удалить пользователя");
        System.out.println("3 - отредактировать пользователя");
        System.out.println("4 - получить список пользователей");
    }


}
