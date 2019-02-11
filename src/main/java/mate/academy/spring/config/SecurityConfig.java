package mate.academy.spring.config;

import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    @Autowired
    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    private UserService userService;

//    void createUser() {
//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword(passwordEncoder().encode("admin"));
//        userService.crete(user);
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        createUser();

//        http.csrf().disable();


//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/resources/**", "/registration").anonymous()
//                .antMatchers("/**").authenticated()
//                .and()
//                .formLogin()
//                .usernameParameter("Username")
//                .passwordParameter("Password")
//                .defaultSuccessUrl("/")
//                .loginPage("/auth/log")
//                .permitAll();


//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/resources/**", "/registration").anonymous()
//                .antMatchers("/**").authenticated()
//                .and()
//                .formLogin()
//                .usernameParameter("username")
//                .passwordParameter("password")
//                .defaultSuccessUrl("/", false)
//                .loginPage("/auth/log")
//                .permitAll()
//                .and()
//                .logout().permitAll()
////                .and().formLogin().defaultSuccessUrl("/", false);
//        ;





        http
                .authorizeRequests()
                .antMatchers("/resources/**", "/registration").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/auth/log")
                .permitAll()
                .and()
                .logout().permitAll()
        // .and().formLogin().defaultSuccessUrl("/", false);
        ;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
