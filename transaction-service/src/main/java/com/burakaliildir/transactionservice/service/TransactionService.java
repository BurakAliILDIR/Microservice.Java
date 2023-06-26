package com.burakaliildir.transactionservice.service;

import com.burakaliildir.transactionservice.model.Transaction;
import com.burakaliildir.transactionservice.repository.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService extends ITransactionService {

    private ITransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAll(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }

    @Override
    public Transaction save(Transaction transaction) {

        transaction.setCreatedAt(LocalDateTime.now());

        return transactionRepository.save(transaction);
    }

    @Override
    public void delete(Long id) {
        transactionRepository.deleteById(id);
    }
}
