package org.sparta.springauth.repository;

import org.sparta.springauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //중복된 값 있는지 확인
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);

}
