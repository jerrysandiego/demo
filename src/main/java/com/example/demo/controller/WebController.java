package com.example.demo.controller;

import com.example.demo.data.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person", produces = "application/json")
public class WebController {
    @GetMapping(value = "/{personId}")
    public @ResponseBody
    Person getPerson(@PathVariable Long personId) {
        Person person = new Person();
        person.setFirstName("Peter");
        person.setLastName("Pan");
        person.setPersonId(personId);
        return person;
    }

    @PostMapping(path = "/")
    public Person addPerson(@RequestBody Person person) {
        //Person person1 = new Person();
        //person1.setFirstName(person.getFirstName());
        //person1.setLastName(person.getLastName());
        person.setPersonId(1000L);

        return person;
    }

    @DeleteMapping(value = "/{personId}")
    public @ResponseBody
    Person deletePerson(@PathVariable Long personId) {
        Person person = new Person();
        person.setFirstName("Peter");
        person.setLastName("Pan");
        person.setPersonId(personId);
        return person;
    }
}
