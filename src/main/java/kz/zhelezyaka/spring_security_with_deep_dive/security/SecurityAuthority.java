package kz.zhelezyaka.spring_security_with_deep_dive.security;

import kz.zhelezyaka.spring_security_with_deep_dive.models.Authority;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
