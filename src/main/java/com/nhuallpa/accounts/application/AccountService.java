package com.nhuallpa.accounts.application;

import com.nhuallpa.accounts.application.port.in.GetBalanceUseCase;
import com.nhuallpa.accounts.domain.BalanceAccount;
import com.nhuallpa.accounts.domain.CurrencySymbol;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService implements GetBalanceUseCase {

    @Override
    public BalanceAccount apply(String accountId) {
        return BalanceAccount.of(accountId, BigDecimal.valueOf(1000.0), CurrencySymbol.ARG_PESO);
    }

}
