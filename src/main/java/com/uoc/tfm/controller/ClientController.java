package com.uoc.tfm.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface ClientController {

    @GetMapping("/doNothing")
    public void doNothing();

}
