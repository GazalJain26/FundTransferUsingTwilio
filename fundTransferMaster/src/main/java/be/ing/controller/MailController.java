package be.ing.controller;

import be.ing.data.Transaction;
import be.ing.data.User;
import be.ing.service.MailService;
import be.ing.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Component
@Path("/send")
public  class MailController {

    @Autowired
    MailService mailService;


    @GET
    @Path("/mail")
    public String triggerEmail() throws Exception{
        User user = new User();

            user.setUserId("396310");
            user.setUserName("MadhavaReddy");
            user.setPassword("kalli");
            user.setEmailAddress("MadhavaReddy.Kalli@cognizant.com");
            user.setPhone("8056201250");
            user.setBalance(10000);



        Transaction transaction = new Transaction();
        transaction.setTransactionId("TEST123");
        transaction.setUserId(user.getUserId());
        transaction.setReceiverMailAddress("kalli.madhavareddy@gmail.com");
        transaction.setSenderOtp(12345);
        transaction.setSenderOtpStatus(Constants.SUCCESS);
        String mailStatus = mailService.triggerEmail(user,transaction);

        return mailStatus;
    }

}
