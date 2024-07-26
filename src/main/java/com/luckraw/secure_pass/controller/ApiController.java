package com.luckraw.secure_pass.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @PostMapping(path = "/validate-password")
    public ResponseEntity<FailurerResponse> validatePassword(@RequestBody BodyRequest reqyest) {


        return ResponseEntity.noContent().build();
    }
}
