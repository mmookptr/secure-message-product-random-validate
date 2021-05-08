package ku.message.repository;

import ku.message.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    /* Jpa creates query for you */
    User findByUsername(String username);
}
