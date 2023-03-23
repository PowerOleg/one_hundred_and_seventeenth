package com.example.demo.members.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Member {
    private String firstName;
    private String lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Member() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }






    public static Member getMember(String name, String lastName) {
        return new Member(name, lastName);
    }
    public static Map<String, Member> getMap() {
        Map<String, Member> map = new HashMap<>();
        map.put("Bob", new Member("Bob", "Robinson"));
        return map;
    }
    public static List<String> getList() {
        return List.of("One", "Two", "Three");
    }



    public String classMethod() {
        return this.firstName.concat(" ").concat(lastName).concat(" ").concat("html used a java method");
    }



    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName;
    }
}
