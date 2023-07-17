package com.pratica.java2023.controller;

import com.pratica.java2023.Account;
import com.pratica.java2023.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller define the input/output for your resource:
 * all account related operation that can be called from outside should be defined here
 */
@RestController
public class AccountController {
    private AccountService accountService;

    /*
    AccountService will get injected here after it is created
     */
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
        System.out.println("Creating Account Controller");
    }

    @GetMapping("/api/account/{resourceId}")
    public String getAccount(@PathVariable String resourceId){
        return accountService.getAccount(resourceId);
    }

    @GetMapping("/api/accounts")
    public List<Account> getAccount(){
        return accountService.getAccounts();
    }
}
