package uz.owl.blogpost.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.blogpost.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String username);

}
