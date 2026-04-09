package com.restaurant.session05_bt04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/menu"})
public class MenuController {
    @GetMapping("/menu")
    public String menu() {
        return "menu/menu-list";
    }

    @GetMapping("/menu/{id}")
    public String menuDetail(@PathVariable("id") Long id) {
        return "menu/detail-menu";
    }
}
