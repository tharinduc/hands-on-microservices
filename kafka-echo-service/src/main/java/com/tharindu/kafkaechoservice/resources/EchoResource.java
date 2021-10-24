package com.tharindu.kafkaechoservice.resources;

import com.tharindu.kafkaechoservice.handlers.EchoMessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/echo")
public class EchoResource {

    @Autowired
    private EchoMessageHandler echoMessageHandler;

    @RequestMapping(path = "/{message}")
    public void echoMessage(@PathVariable("message") String msg) {
        this.echoMessageHandler.sendMessage(msg);
    }
}
