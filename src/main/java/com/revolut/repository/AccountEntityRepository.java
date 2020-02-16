package com.revolut.repository;

import com.revolut.domain.AccountEntity;
import com.revolut.domain.AccountTransactionEntity;

import java.math.BigDecimal;
import java.util.List;

public interface AccountEntityRepository {

    AccountEntity saveAccount(AccountEntity accountEntity);

    AccountEntity getAccountById(Long id);

    AccountEntity getAccountByEmail(String emailAddress);

    List<AccountEntity> getAllAccounts();

    void deleteAccount(Long id);

    boolean doesAccountExistById(Long id);

    void updateAccountBalancesAndTransactionLog(AccountEntity updatedSenderAccountBalance,
                                           AccountEntity updatedRecieverAccountBalance,
                                           AccountTransactionEntity accountTransactionEntity);

    void updateUserAccountBalance(AccountEntity accountEntity, BigDecimal bigDecimal) throws Exception;
}
