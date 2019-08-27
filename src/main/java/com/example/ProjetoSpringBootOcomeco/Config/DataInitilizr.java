package com.example.ProjetoSpringBootOcomeco.Config;
import com.example.ProjetoSpringBootOcomeco.Repository.UserRepository;
import com.example.ProjetoSpringBootOcomeco.projeto.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.lang.String;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserRepository userRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0){


        List<User> users = userRepository.findAll();

        if (users.isEmpty()){

            CreateUser("Luiz","luizgustavo@hotmail.com");
            CreateUser("thiago","thiaguinho@gmail.com");
            CreateUser("leticia","leticia@hotmail.com");

        }

      //  User user = userRepository.getOne(1L);
      //  user.setName("Nataniel Paiva");
      //  userRepository.save(user);

    }

    public void CreateUser(String name, String email){

        User user = new User(name,email);

        userRepository.save(user);
    }
}
