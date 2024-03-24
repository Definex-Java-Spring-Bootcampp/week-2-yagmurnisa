package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.CreditCardDto;
import com.patika.kredinbizdeservice.model.Bank;
import com.patika.kredinbizdeservice.service.BankService;
import com.patika.kredinbizdeservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banks")
public class BankController {

    @Autowired
    private BankService bankService;


    // create user
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Bank create(@RequestBody Bank bank) {
        return bankService.save(bank);
    }

    /*
    get all users
     */
    @GetMapping
    public List<Bank> getAll() {
        return bankService.getAll();
    }

    @GetMapping("/{name}/cards")
    public List<CreditCardDto> getCards(@PathVariable String name) {
        return bankService.getCards(name);
    }
    

   /* @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }*/
}
