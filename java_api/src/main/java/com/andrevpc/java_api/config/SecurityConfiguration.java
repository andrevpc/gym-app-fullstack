package com.andrevpc.java_api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import static org.springframework.security.config.Customizer.withDefaults;
import com.andrevpc.java_api.filter.SecurityFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Autowired
    private SecurityFilter securityFilter;

    @Bean
    public SecurityFilterChain setSecurityFilterChain(final HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .cors(withDefaults())
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                        .requestMatchers(HttpMethod.POST, "/user").permitAll()
                        .requestMatchers(HttpMethod.GET, "/user/isTrainer/*").permitAll()
                        .requestMatchers(HttpMethod.GET, "/user").permitAll()
                        .requestMatchers(HttpMethod.DELETE, "/user/*").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/user/*").permitAll()
                        .requestMatchers(HttpMethod.GET, "/day/user/*").permitAll()
                        .requestMatchers(HttpMethod.GET, "/day").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/day/*").permitAll()
                        .requestMatchers(HttpMethod.GET, "/exercise").permitAll()
                        .requestMatchers(HttpMethod.PUT, "/exercise/*").permitAll()
                        .requestMatchers(HttpMethod.GET, "/exercise/day/*").permitAll()
                        .anyRequest()
                        .authenticated())
                .addFilterBefore(this.securityFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }
}