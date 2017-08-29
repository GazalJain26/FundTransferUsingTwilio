package be.ing.service;

import be.ing.data.Transaction;
import be.ing.data.User;

import java.util.Date;

public interface MailService {
    public String triggerEmail(User user, Transaction transaction) ;
    public Date calculateExpiryDate(int expiryTimeInMinutes);
}
