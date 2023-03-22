package com.example.demo.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/intro")
public class IntroHandler {

    @GetMapping/*(value = "/")*/     //это подразумевается но на /intro/ не реагирует только на /intro
    public String index() {
        return "intro/index";
    }




//
//    @RequestMapping(value = "/about",
//     method = {RequestMethod.GET, RequestMethod.POST})
//    public String about() {
//        return intro/about";
//    }






    //RegEx чтобы, если не цифра, то метод не запускался и сервер не падал и не ругался
    @RequestMapping(value = "/user/{id:[\\d]+}/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String users(
        @PathVariable("id") long number,
        @PathVariable String name
    ) {
        return String.format("You requested name = %s with id = %d", name, number);
    }

    //запрос /bar?id=100
    @RequestMapping(value = "/bar", method = RequestMethod.GET)
    @ResponseBody
    public String users(
            @RequestParam("id") long number) {
        return "You requested the parameter " + number;
    }









    //запрос с несколькими параметрами id и name   /bar?id=100&name=Mark
    @RequestMapping(value = "/bar", params = {"id", "name"}, method = RequestMethod.GET)
    @ResponseBody
    public String bars(
            @RequestParam("id") long number,
            @RequestParam String name
    ) {
        return String.format("You requested name %s with id %d", name, number);
    }
}
