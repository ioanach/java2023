package com.pratica.java2023;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.pratica.java2023.repository.AccountRepository;
import com.pratica.java2023.service.AccountService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class AccountServiceTest {
    @Mock
    private AccountRepository accountRepoMock;

    private AccountService accountService;

    @BeforeEach
    public void setup(){
        accountService = new AccountService(accountRepoMock);
    }

    @Test
    public void testGetAccountNotExisting(){
        assertEquals("No information for this account",accountService.getAccount("0"));
    }
}
