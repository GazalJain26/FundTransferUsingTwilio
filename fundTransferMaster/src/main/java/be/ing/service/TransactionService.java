package be.ing.service;

import be.ing.data.Transaction;

public interface TransactionService {
    public String createTransaction(Transaction transaction);
    public Transaction getTransaction();
    public String updateTransaction(Transaction transaction);
    public String deleteTransaction(Transaction transaction);
}
