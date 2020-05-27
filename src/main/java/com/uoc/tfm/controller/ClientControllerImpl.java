package com.uoc.tfm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientControllerImpl implements ClientController {

    private static Logger log = LoggerFactory.getLogger(ClientControllerImpl.class);

    @Override
    public void doNothing() {
        System.out.println("I'm very tired today");
    }

}
