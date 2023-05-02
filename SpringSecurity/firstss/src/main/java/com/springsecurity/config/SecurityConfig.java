package com.springsecurity.config;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        // http.authorizeHttpRequests((authz) -> authz
        // .requestMatchers("/").permitAll()
        // .requestMatchers("/java-course").authenticated() )
        // .formLogin(form -> form
        // .loginPage("/login")
        
        // );
        http.authorizeHttpRequests((authz) -> authz
        // .requestMatchers("/index").hasRole("USER")
        //.requestMatchers("/").hasRole("ADMIN")
        .requestMatchers("/java-course").hasRole("USER")
        .requestMatchers("/premium-courses").hasRole("ADMIN")
        .anyRequest().authenticated()
        )
        .formLogin(withDefaults()) //Using default login page 
        // .httpBasic(withDefaults()) //Using another default login page 
        .logout()  ;
		return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        UserDetails user = User.withUsername("user1")
        .password(passwordEncoder().encode("user1Pass"))
        .roles("USER")
        .build();
        UserDetails admin = User.withUsername("admin")
        .password(passwordEncoder().encode("adminPass"))
        .roles("ADMIN")
        .build();
        return new InMemoryUserDetailsManager(user,admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
