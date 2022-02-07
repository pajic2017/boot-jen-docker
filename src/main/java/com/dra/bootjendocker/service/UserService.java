package com.dra.bootjendocker.service;

import com.dra.bootjendocker.entity.User;
import com.dra.bootjendocker.model.UserModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    /** Create a new User */
    ResponseEntity<Object> createUser(User model);

    /**Find all users*/
    List<UserModel > getUsers();

    /** Update an Existing User */
    ResponseEntity<Object> updateUser(User user, Long id);

    /** Delete an User*/
    ResponseEntity<Object> deleteUser(Long id);

    /**Find one user by Id*/
    UserModel getUser(Long id);



}
