package com.contact.info.controller;

import com.contact.info.data.ReqData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostStart {

    @RequestMapping(method = RequestMethod.POST, path = "/post1", produces = "application/json")
    public ResponseEntity<ReqData> postData(@RequestBody  ReqData request) {
        System.out.println("value here: " + request);


        return new ResponseEntity<>(request, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/post2")
    public String postData(@RequestBody  String request) {
        return "value here: " + request;
    }

}
