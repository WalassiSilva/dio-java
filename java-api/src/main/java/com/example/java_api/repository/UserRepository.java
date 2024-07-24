package com.example.java_api.repository;

import com.example.java_api.handler.BusinessException;
import com.example.java_api.handler.RequiredFieldsException;
import com.example.java_api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {

        if(user.getLogin() == null) {
            throw new RequiredFieldsException("login");
        }

        if(user.getPassword() == null){
            throw new RequiredFieldsException("password");
        }

        if(user.getId() == null){
            System.out.println("SAVE - Recebendo o User na camada Repository");
        }else {
            System.out.println("UPDATE - Recebendo o User na camada Repository");
        }
        System.out.println(user);
    }

    public void deleteById(int id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um User", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando Users");
        List<User> users = new ArrayList<>();
        users.add(new User ("Ana", "senhaana"));
        users.add(new User ("Bob", "senhabob"));
        users.add(new User("Caio", "senhacaio"));
        return users;
    }

    public User findById(int id) {
        System.out.println(String.format("FIND - Recebendo o id: %d para localizar um user"));
        return new User ("Ana", "senhaana");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND - Recebendo o username: %s para locar um User", username));
        return new User("Ana", "senhaana");
    }

}
