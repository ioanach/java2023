package com.pratica.java2023.service;

import com.pratica.java2023.Account;
import com.pratica.java2023.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Complex login related to accounts should go here
 *
 * This is annotated with @Service, so it is a Spring bean, which means that it will be created automatically
 *
 */
@Service
public class AccountService {

//    @Autowired
    /*
    Field injection is discouraged since it makes the code harder to test and maintain
     */
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println(accountRepository);
        System.out.println("Creating Account Service");
    }

    public String getAccount(String accountId){
        if(accountId.equals("0")){
            return "No information for this account";
        }
        Account account  = accountRepository.getAccount(accountId);
        if(account!= null){
            return account.toString();
        } else{
            return  "Account does not exist";
        }

    }

    public List<Account> getAccounts(){
        return accountRepository.getAccounts();
    }
}
