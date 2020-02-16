package com.springsecurity.jpa.springbootsecurityjpa.service;

import com.springsecurity.jpa.springbootsecurityjpa.model.User;
import com.springsecurity.jpa.springbootsecurityjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SreeUserDerailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository ;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      return userRepository.findByName(s).map(SreeUserDetails::new)
              .orElseThrow(()-> new UsernameNotFoundException("User not found"));
    }
}
