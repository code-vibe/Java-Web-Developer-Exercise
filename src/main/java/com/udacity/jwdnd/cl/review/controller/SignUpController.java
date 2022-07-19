package com.udacity.jwdnd.cl.review.controller;

import com.udacity.jwdnd.cl.review.model.User;
import com.udacity.jwdnd.cl.review.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.invoke.StringConcatException;

@Controller
@RequestMapping("/signup")
public class SignUpController {

    private final UserService userService;
    public SignUpController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String signUpView() {
        return "signup";
    }
    @PostMapping
    public String signupUser(@ModelAttribute User user, Model model) {
        String signupError = null;

        if (!userService.isUsernameAvailable(user.getUsername())) {
            signupError = "The username already exists.";
        }
        if (signupError == null) {
            int rowsAdded = userService.createUser(user);
            if (rowsAdded < 0) {
                signupError = "There was an error signing you up. Please Try again.";
            }
        }
        if (signupError == null) {
            model.addAttribute("signupSuccess", this);
        }
     return "signup";
    }

}
