package Register.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<userEntity, Long> {
	userEntity findByUsername(String username);
}

