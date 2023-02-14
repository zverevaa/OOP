package Repository;


import Model.User;

import java.io.FileWriter;
import java.util.List;

public class UserRepository<T extends User> {
    public void save(T user){
        try(FileWriter fileWriter = new FileWriter("users.txt")){
            fileWriter.write(user.toString());
            fileWriter.flush();

        }catch (Exception exception){}
    }
    public void remove(T user){}

    public void edit(T user){}

    public List getAllUsers(){
        return null;
    }
}
