package com.ironbanknice.ironbank.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironbanknice.ironbank.model.Person;
import com.ironbanknice.ironbank.services.MoneyService;
import com.nice.ironbankstarter.ironbanknicestart.StarterConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/iron-bank")
@RequiredArgsConstructor
public class IronBankController {

    private final MoneyService moneyService;

    @GetMapping("/loan")
    public String loan(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        long remaining = moneyService.loan(name, amount);
        if (remaining == -1) {
            return "loan declined, you will not survive this winter, or we don't have money, or we just don't like you";
        }else {
            return "loan was accepted, " + amount + " was transferred to " + name + " \ncurrent balance: " + remaining;
        }
    }













    @GetMapping("/ping/{user_name}")
    public String ping(@PathVariable("user_name") String userName){
        return "Game Of thrones, Welcome "+userName;
    }
    @GetMapping("/ping")
    public String pingWithRequestParam(@RequestParam("user_name") String userName){
        return "Game Of thrones, Welcome "+userName;
    }

    @PostMapping("/inc_person")
    public Person incAge(@RequestBody Person person) {
        return new Person(person.getName(), person.getAge() + 1);
    }
}
