package be.ing.service.impl;

import be.ing.service.SendMessageService;
import org.springframework.stereotype.Service;

@Service
public class SendMessageServiceImpl implements SendMessageService {


    @Override
    public String generateOTP() {
        int randomPin = (int)(Math.random()*9000)+1000;
        return String.valueOf(randomPin);

    }
}
