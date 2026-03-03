package com.miyuudev.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.miyuudev.demo.model.Account;
import com.miyuudev.demo.repository.AccountRepository;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(Account account) {
        return repository.save(account);
    }

    public List<Account> listAccounts() {
        return repository.findAll();
    }
}
