package com.example.exerciseintroductiontospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController

public class welcomeController {
ArrayList<String>names = new ArrayList<String>();
    @GetMapping("/info")
    public String name(String name) {

        return "My name's Faisal";
    }
    @GetMapping("/age")

    public String age() {

        return "\n\tI'm 24";
    }
    @GetMapping("/check")

    public String check() {

        return "\n\tEverything OK";
    }
    @GetMapping("/health")

    public String health() {

        return "\n\tServer health is up and running";
    }

    @GetMapping("/list")

    public  String names() {
        names.add("Faisal");
        names.add("Ali");
        names.add("Fahad");
    return names.toString();
    }



}
