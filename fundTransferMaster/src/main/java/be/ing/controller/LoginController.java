package be.ing.controller;

import be.ing.data.User;
import be.ing.service.UserService;
import be.ing.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Component
@Path("/login")
public class LoginController {
    @Autowired
    UserService userService;

    @POST
    @Path("/user")
    public User getUserDetails() {
        return null;
    }
    public String registerUser(User user){
        String status=userService.createUser(user);
        if(status.equals(Constants.SUCCESS)){

        }else{

        }
        return "User Created Successfully";
    }
    public String updateUserDetails(User user){
        return "User Updated Successfully";
    }





}