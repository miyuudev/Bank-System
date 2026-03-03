package com.miyuudev.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.miyuudev.demo.model.Account;
import com.miyuudev.demo.service.AccountService;
import java.util.List;


@RestController
@RequestMapping ("/accounts")
public class AccountController {

    private final AccountService service;

    private AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.createAccount(account);
    }

    @GetMapping
    public List<Account> list() {
        return service.listAccounts();
    }

    }
