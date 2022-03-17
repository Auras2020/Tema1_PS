package com.example.tema1.controller;
import com.example.tema1.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {

    @Autowired
    public MainController(){

    }

    @GetMapping("")
    public String showMenu(){
        return "index";
    }

}