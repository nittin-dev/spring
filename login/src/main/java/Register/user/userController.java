package Register.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/register")
    public ResponseEntity<userEntity> registerUser(@RequestBody userEntity user) {
        userEntity registeredUser = userService.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<userEntity> getUser(@PathVariable Long userId) {
        userEntity user = userService.getUserById(userId);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/all")
    public ResponseEntity<List<userEntity>> getAllUsers() {
        List<userEntity> allUsers = userService.getAllUsers();
        if (!allUsers.isEmpty()) {
            return ResponseEntity.ok(allUsers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/getPassword")
    public ResponseEntity<String> getPasswordByUsername(@RequestParam String username) {
        String password = userService.getPasswordByUsername(username);
        if (password != null) {
            return ResponseEntity.ok(password);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}

