package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = repository.filterByName("user");

        User user = new User();
        user.setName("user 3");
        user.setUserName("user 3");
        user.setPassword("senha");

        repository.save(user);

        for(User u : repository.findAll()){
            System.out.println(u);
        }

    }
}
