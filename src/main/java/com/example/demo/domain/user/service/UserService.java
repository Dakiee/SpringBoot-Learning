package com.example.demo.domain.user.service;

import java.util.List;
import com.example.demo.domain.user.model.MUser;

public interface UserService {
    // User Signup
    public void signup(MUser user);

    /** Get user */
    public List<MUser> getUsers();
}
