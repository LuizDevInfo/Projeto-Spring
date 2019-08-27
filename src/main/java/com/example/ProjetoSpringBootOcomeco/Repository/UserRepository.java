package com.example.ProjetoSpringBootOcomeco.Repository;

import com.example.ProjetoSpringBootOcomeco.projeto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
