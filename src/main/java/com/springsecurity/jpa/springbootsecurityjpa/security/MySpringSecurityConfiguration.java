package com.springsecurity.jpa.springbootsecurityjpa.security;

import com.springsecurity.jpa.springbootsecurityjpa.service.SreeUserDerailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private SreeUserDerailsService myUserDetailsService;

    @Override

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/sree/").hasRole("ADMIN")
                .antMatchers("/sajana/").hasRole("USER")
                .antMatchers("/sreyaan/").hasRole("CHILD")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }

    PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
