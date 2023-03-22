package com.example.demo.intro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/intro")
public class IntroPOST {

    @RequestMapping(value = "/about",                               //сразу и для GET и для POST запросов
            method = {RequestMethod.GET, RequestMethod.POST})
    public String about() {
        return "intro/about";
    }


//    @PostMapping(value = "/bar")
//    public ResponseEntity<?> newBazz(
//            @RequestParam("name") String nickname) {
//        return new ResponseEntity<>(new Bazz("5", nickname), HttpStatus.OK);
//    }



//    @PutMapping(value = "/{id}")
//    public ResponseEntity<?> updateBazz(
//            @PathVariable String id,
//            @RequestParam("name") String nickname) {
//        return new ResponseEntity<>(new Bazz(id, nickname), HttpStatus.OK);
//    }




//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity<?> deleteBazz(
//            @PathVariable String id
//    ) {
//        return new ResponseEntity<>(new Bazz(id), HttpStatus.OK);
//    }

}
