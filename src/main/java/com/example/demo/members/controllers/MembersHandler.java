package com.example.demo.members.controllers;

import com.example.demo.members.models.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.members.models.Member.*;

@Controller
@RequestMapping("/members")
public class MembersHandler {
    private static List<Member> memberslist = new ArrayList<>();

//Thymeleaf lessons
    @GetMapping //имеется в виду путь который у класса(см выше)
    public String toMembers(Model model) {                                                                                     //через Model данные поподают в другие части приложения(контроллеры, темплейты т.д.)
        model.addAttribute("members", memberslist);             //1 передает memberslist под именем members в html
        model.addAttribute("Name", "Oleg");
        model.addAttribute("member", getMember("Kolya", "Petrov"));
//передаем мапу, List
        model.addAttribute("memberMap", getMap());
        model.addAttribute("memberList", getList());
        model.addAttribute("memberObject", getMember("Pedro", "Muchos"));

        return "members/members";
    }















//    @GetMapping("/new_member")
    public String toAddMember() {
        return "members/new_member";
    }


//    @PostMapping("/new_member/create")
    public String createMember(
            @RequestParam String firstName,
            @RequestParam String lastName,
            Model model
    ) {
        memberslist.add(new Member(firstName, lastName));
//        model.addAttribute("firstName", firstName);
//        model.addAttribute("lastName", lastName);
//        return "members/members";               //тут контроллер по новой не запускается, а открывается сразу файл
        return "redirect:/members";             //это редирект на контроллер для страницы и всё выполняется что в контроллере
    }
}
