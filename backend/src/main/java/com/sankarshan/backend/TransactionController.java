package com.sankarshan.backend;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @GetMapping
    public List<Transaction> getTransactions() {
        Transaction t1 = new Transaction();
        t1.setId(1L);
        t1.setDate(LocalDate.of(2026, 10, 1));
        t1.setDescription("Swiggy order");
        t1.setAmount(250.0);
        t1.setCategory("Food");

        Transaction t2 = new Transaction(2L, LocalDate.of(2026, 10, 2), "Mobile recharge", 299.0, "Bills");
        Transaction t3 = new Transaction(3L, LocalDate.of(2026, 10, 3), "Grocery store", 840.5, "Groceries");

        return List.of(t1, t2, t3);
    }
}