package me.yling.crabbywebpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
{
    @GetMapping("/")
    public String showCrabcake()
    {
        return "crabcake";
    }






}
