package com.chibon.fleamarket.dao;

import com.chibon.fleamarket.dto.UserRegisterRequest;
import com.chibon.fleamarket.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
