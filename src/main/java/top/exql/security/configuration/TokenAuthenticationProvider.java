package top.exql.security.configuration;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;
import top.exql.security.UserService;

import java.util.Collections;

public class TokenAuthenticationProvider implements AuthenticationProvider {

    UserService userService;

    public TokenAuthenticationProvider(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        throw new BadCredentialsException("hello");
    }

    @Override
    public boolean supports(Class<?> aClass) {
        System.out.println(aClass);
        TokenAuthenticationProvider.class.isAssignableFrom(aClass);
        return true;
    }
}
