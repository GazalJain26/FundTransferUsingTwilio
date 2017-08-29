package be.ing.service.impl;

import be.ing.data.Transaction;
import be.ing.data.User;
import be.ing.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender sender;

    @Override
    public String triggerEmail(User user, Transaction transaction)  {
        String mailStatus = null;
        try {
            MimeMessage message = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setTo(transaction.getReceiverMailAddress());

            String confirmationUrl
                    = "/transferConfirmation.html?uid=" + transaction.getTransactionId();

            helper.setText("Please Enter OTP in Below Link and Confirm\n"+ " <a href='" + "http://localhost:8080" + confirmationUrl+"'>Click here to trasfer funds</a>");
            helper.setSubject(user.getUserId()+ " Initiated Fund Transfer");

            try {
                sender.send(message);
                mailStatus = "{\"message\": \"OK\"}";
            } catch (Exception e) {
                e.printStackTrace();
                mailStatus = "{\"message\": \"Error\"}";
            }
        }catch(Exception ex){
            mailStatus = "{\"message\": \"Error\"}";
        }
        return mailStatus;
    }

    @Override
    public Date calculateExpiryDate(int expiryTimeInMinutes) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Timestamp(cal.getTime().getTime()));
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());




            /* smtp server
            Send Email though Java using smtp
            CASANDRA DB:::UserID |OTP
            Send OTP to MOBILE
            generate a unique key, encrypt it and add it to registration link (http://localhost:8080?sId=XXXXXXXXXXX) and save non-encrypted key in database (you need some kind of cross verification process)
            when user clicks link, grab the key and decrypt it and validate the key with key in database
            Validte User
            Current Transefer Status
            Validate OTP*/

    }
}
