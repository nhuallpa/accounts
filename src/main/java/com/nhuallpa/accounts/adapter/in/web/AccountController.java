package com.nhuallpa.accounts.adapter.in.web;

import com.nhuallpa.accounts.application.port.in.GetBalanceUseCase;
import com.nhuallpa.accounts.domain.BalanceAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final GetBalanceUseCase getBalanceUseCase;

    @GetMapping("/{id}")
    public BalanceAccount getBalance(@PathVariable("id") String accountId) {
        return getBalanceUseCase.apply(accountId);
    }

}
