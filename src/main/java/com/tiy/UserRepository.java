package com.tiy;


import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by silve on 5/17/2016.
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);


    Object save(UserRepository user);


}