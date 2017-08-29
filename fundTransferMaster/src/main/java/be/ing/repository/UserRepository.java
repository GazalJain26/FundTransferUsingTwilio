package be.ing.repository;

import be.ing.data.User;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    @Query("Select * from user where userId=?0")
    public User findByFirstName(String firstName);

    /*@Query("Select * from user where userId=?0")
    public List<User> findByLastName(String lastName);*/
}
