package com.nhuallpa.accounts.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BalanceAccount {

    private String accountId;
    private BigDecimal amount;
    private CurrencySymbol currencySymbol;

    private BalanceAccount(String accountId, BigDecimal amount, CurrencySymbol currencySymbol) {
        this.accountId = accountId;
        this.amount = amount;
        this.currencySymbol = currencySymbol;
    }

    public static BalanceAccount of(String accountId, BigDecimal amount, CurrencySymbol currencySymbol) {
        return new BalanceAccount(accountId, amount, currencySymbol);
    }
}
