package be.ing.controller;

import be.ing.data.Transaction;
import be.ing.service.SendMessageService;

import be.ing.util.Constants;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;


@Component
@Path("/authentication")
public class SendMessageController {

    @Autowired
   SendMessageService sendMessageService;
    Transaction transaction;

    @POST
    @Path("/sendMessage")
    public  String sendMessage(){
        System.out.println("Hi");
        List<NameValuePair> senderDetailsList;
        List<NameValuePair> recieverDetailsList;
        String firstOtp = sendMessageService.generateOTP();
        String secondOtp = sendMessageService.generateOTP();
        try{
            TwilioRestClient client = new TwilioRestClient(Constants.TWILIO_ACCNT_NUMBER,Constants.AUTH_TOKEN);
            senderDetailsList = new ArrayList<>();
            transaction = new Transaction();
            senderDetailsList.add(new BasicNameValuePair("Body", "generated OTP is " +firstOtp));
            //senderDetailsList.add(new BasicNameValuePair("To", transaction.getSenderPhone()));
            //for testing purpose
            senderDetailsList.add(new BasicNameValuePair("To","+919167033690"));
            senderDetailsList.add(new BasicNameValuePair("From",Constants.TWILIO_MOB_NUMBER));
            recieverDetailsList = new ArrayList<>();
            recieverDetailsList.add(new BasicNameValuePair("Body", "generated OTP is " +secondOtp));
           // senderDetailsList.add(new BasicNameValuePair("To", transaction.getReceiverPhone()));
            //for testing purpose
            recieverDetailsList.add(new BasicNameValuePair("To","+919576041316"));
            recieverDetailsList.add(new BasicNameValuePair("From",Constants.TWILIO_MOB_NUMBER));
            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            messageFactory.create(senderDetailsList);
            messageFactory.create(recieverDetailsList);
            System.out.println("first otp is :" +firstOtp);
            System.out.println("first otp is :" +secondOtp);

        } catch (TwilioRestException e) {
            e.printStackTrace();
        }

        return  "successfully send";
    }


}
