package com.burakaliildir.transactionservice.controller;

import com.burakaliildir.transactionservice.model.Transaction;
import com.burakaliildir.transactionservice.service.ITransactionService;
import com.burakaliildir.transactionservice.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {

    private ITransactionService transactionService;

    @GetMapping("{userId}")
    public ResponseEntity<?> getAll(@PathVariable Long userId) {

        var transactions = transactionService.getAll(userId);

        return ResponseEntity.ok(transactions);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Transaction transaction) {

        return ResponseEntity.ok(transactionService.save(transaction));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {

        transactionService.delete(id);

        return ResponseEntity.ok(null);
    }

}
