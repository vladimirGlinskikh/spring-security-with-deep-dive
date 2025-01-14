package kz.zhelezyaka.spring_security_with_deep_dive.repositories;

import kz.zhelezyaka.spring_security_with_deep_dive.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("""
            SELECT u FROM User u WHERE u.username = :username
            """)
    Optional<User> findUserByUsername(String username);
}
