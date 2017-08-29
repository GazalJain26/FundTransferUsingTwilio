package be.ing.service.impl;


import be.ing.data.User;
import be.ing.service.UserService;
import be.ing.util.Constants;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String createUser(User user) {
        System.out.println("LOG::User Created Successfully::Yet to integrate with DB");//Yet to integrate with DB
        return Constants.SUCCESS;
    }

    @Override
    public User getUser(User user) {
        User fetchUser = new User();
        if(user.getUserId().equals("396310")) {
            fetchUser.setUserId("396310");
            fetchUser.setUserName("MadhavaReddy");
            fetchUser.setPassword("kalli");
            fetchUser.setEmailAddress("MadhavaReddy.Kalli@cognizant.com");
            fetchUser.setPhone("8056201250");
            fetchUser.setBalance(10000);
            return fetchUser;
        }else{
            return null;
        }
    }

    @Override
    public User getReceiverUser(User user) {
        User fetchReceiverUser = new User();
        if(user.getUserId().equals("123456")) {
            fetchReceiverUser.setUserId("123456");
            fetchReceiverUser.setUserName("SatyaPavan");
            fetchReceiverUser.setPassword("password");
            fetchReceiverUser.setEmailAddress("SatyaPavan@cognizant.com");
            fetchReceiverUser.setPhone("123456789");
            fetchReceiverUser.setBalance(10000);
            return fetchReceiverUser;
        }else{
            return null;
        }
    }

    @Override
    public String updateUser(User user) {
        return null;
    }

    @Override
    public String deleteUser(User user) {
        return null;
    }
}
