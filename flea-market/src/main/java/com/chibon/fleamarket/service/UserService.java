package com.chibon.fleamarket.service;

import com.chibon.fleamarket.dto.UserRegisterRequest;
import com.chibon.fleamarket.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
