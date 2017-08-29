package be.ing.config;

import be.ing.controller.LoginController;
import be.ing.controller.MailController;
import be.ing.controller.SendMessageController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(LoginController.class);
        register(MailController.class);
        register(SendMessageController.class);

    }
}