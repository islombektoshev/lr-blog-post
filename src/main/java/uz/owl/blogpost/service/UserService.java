package uz.owl.blogpost.service;

import org.springframework.stereotype.Service;
import uz.owl.blogpost.dao.UserRepository;
import uz.owl.blogpost.entity.User;

@Service
public class UserService {
    private final
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean addNewUser(User user){
        User old = userRepository.findByUsername(user.getUsername());
        if (old != null) return false;
        userRepository.save(user);
        return true;
    }

    public void save(User user){
        userRepository.save(user);
    }

    public void delete(User user){
        userRepository.delete(user);
    }

}
