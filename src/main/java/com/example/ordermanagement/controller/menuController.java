package com.example.ordermanagement.controller;

import com.example.ordermanagement.model.menu;
import com.example.ordermanagement.repository.menuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class menuController {

    @Autowired
    menuRepository menu;


    // Get all the items in the menu
    @GetMapping("/getMenu")
    public List<menu> getMenu() {
        return menu.findAll();
    }

    //add a new item in the menu
    @PostMapping("/addItem")
    public menu addItem(@RequestBody menu item) {
        return menu.save(item);
    }

}
