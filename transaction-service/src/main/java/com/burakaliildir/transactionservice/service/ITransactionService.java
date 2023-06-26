package com.burakaliildir.transactionservice.service;

import com.burakaliildir.transactionservice.model.Transaction;

import java.util.List;

public abstract class ITransactionService {
    public abstract List<Transaction> getAll(Long userId);

    public abstract Transaction save(Transaction transaction);

    public abstract void delete(Long id);
}
