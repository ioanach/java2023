package com.pratica.java2023.repository;

import com.pratica.java2023.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AccountRepository {
    private  List<Account> accounts;

    public AccountRepository() {
        System.out.println("Creating AccountRepository");
        accounts = new ArrayList<>();
        accounts.add(new Account("123"));
        accounts.add(new Account("124"));
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public Account getAccount(String id){
        Optional<Account> account = accounts.stream().filter(a-> id.equals(a.getAccountId())).findFirst();
        if(account.isPresent()){
            return account.get();
        }
        return null;
    }
}
