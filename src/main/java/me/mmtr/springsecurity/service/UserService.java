package me.mmtr.springsecurity.service;

import me.mmtr.springsecurity.data.User;
import me.mmtr.springsecurity.data.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDto);
    User findUserByUsername(String username);

    List<UserDTO> findAllUsers();
}
