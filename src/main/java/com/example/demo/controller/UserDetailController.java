package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.form.UserDetailForm;

@Controller
@RequestMapping("/user")
public class UserDetailController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    // Dispay user details screen
    @GetMapping("detail/{userId:.+}")
    public String gerUser(UserDetailForm form, Model model, @PathVariable("userId") String userId) {
        // Get user
        MUser user = userService.getUserOne(userId);
        user.setPassword(null);

        // Get user
        form = modelMapper.map(user, UserDetailForm.class);

        // Registered in Model
        model.addAttribute("userDetailForm", form);

        // Dispay user details screen
        return "user/detail";
    }
}
