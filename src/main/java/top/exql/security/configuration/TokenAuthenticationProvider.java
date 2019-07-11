package top.exql.security.configuration;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collections;

public class TokenAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication auth = new UsernamePasswordAuthenticationToken(null, "", Collections.singletonList(new SimpleGrantedAuthority("ROLE_API")));
        return auth;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        System.out.println(aClass);
        TokenAuthenticationProvider.class.isAssignableFrom(aClass);
        return true;
    }
}
