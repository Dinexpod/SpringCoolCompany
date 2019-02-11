package mate.academy.spring.security;

import lombok.extern.log4j.Log4j2;
import mate.academy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Log4j2
@Component
public class MyUserDetailsServiceImpl implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public MyUserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        mate.academy.spring.model.User user  = userService.findUserByUsername(username);
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        Set<GrantedAuthority> authoritySet = new HashSet<>();
//        log.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! " + user.toString() );
//        System.out.println(user.toString());
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//        return new User(user.getUsername(), user.getPassword(),  authoritySet);
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("____________________________---------------------_____________--------");
        mate.academy.spring.model.User user = userService.findByUsername(username);
        Set<GrantedAuthority> authoritySet = new HashSet<>();
        return new org.springframework.security.core.
                userdetails.User(user.getUsername(), user.getPassword(), authoritySet);
    }
}
