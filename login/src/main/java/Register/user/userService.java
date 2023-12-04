package Register.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class userService {
    @Autowired
    private UserRepository userRepository;

    public userEntity registerUser(userEntity user) {
        return userRepository.save(user);
    }
    public userEntity getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }
    public List<userEntity> getAllUsers() {
        return userRepository.findAll();
    }
    public String getPasswordByUsername(String username) {
        userEntity user = userRepository.findByUsername(username);
        if (user != null) {
            return user.getPassword();
        } else {
            // Handle the case where the user with the given username doesn't exist
            return null;
        }
    }
}
