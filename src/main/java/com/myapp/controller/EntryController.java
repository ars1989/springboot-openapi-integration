package com.myapp.controller;


import com.myapp.models.Request;
import com.myapp.models.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntryController {


    @PostMapping(value = "/post/product", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Response entryMethod(@RequestBody Request request) {

        return new Response();

    }
}
