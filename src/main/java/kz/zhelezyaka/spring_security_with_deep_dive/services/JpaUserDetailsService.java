package kz.zhelezyaka.spring_security_with_deep_dive.services;

import kz.zhelezyaka.spring_security_with_deep_dive.repositories.UserRepository;
import kz.zhelezyaka.spring_security_with_deep_dive.security.SecurityUser;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {

        var u = userRepository.findUserByUsername(username);

        return u.map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException("Username not found " + username));
    }
}
