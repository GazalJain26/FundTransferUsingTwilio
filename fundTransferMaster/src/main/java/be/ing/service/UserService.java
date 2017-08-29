package be.ing.service;

import be.ing.data.User;

public interface UserService {
    public String createUser(User user);
    public User getUser(User user);
    public User getReceiverUser(User user);
    public String updateUser(User user);
    public String deleteUser(User user);
}
