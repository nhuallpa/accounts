package com.nhuallpa.accounts.application.port.in;

import com.nhuallpa.accounts.domain.BalanceAccount;

import java.util.function.Function;

public interface GetBalanceUseCase extends Function<String, BalanceAccount> {

}
