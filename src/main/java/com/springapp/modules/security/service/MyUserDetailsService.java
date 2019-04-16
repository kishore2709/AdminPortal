package com.springapp.modules.security.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.modules.security.JwtUser;
import com.springapp.modules.security.repository.UserRepository;
import com.springapp.modules.system.domain.Dept;
import com.springapp.modules.system.domain.Job;
import com.springapp.modules.system.domain.User;


@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    
    @Autowired
    private JwtPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail)
            throws UsernameNotFoundException {
        // Let people login with either username or email
     
    	User user = userRepository.findByUsername(usernameOrEmail)
                .orElseThrow(() -> 
                        new UsernameNotFoundException("User not found with username or email : " + usernameOrEmail)
        );
    	 if (user!= null) {
    	        
    	        // Throw specific exception based on boolean value
             return createJwtUser(user);
         }
		return null;
    }

    // This method is used by JWTAuthenticationFilter
    public UserDetails loadUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
            () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return createJwtUser(user);
    }
    
    public UserDetails createJwtUser(User user) {
        return new JwtUser(
        		user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getAvatar(),
                user.getEmail(),
                user.getPhone(),
                Optional.ofNullable(user.getDept()).map(Dept::getName).orElse(null),
                Optional.ofNullable(user.getJob()).map(Job::getName).orElse(null),
                permissionService.mapToGrantedAuthorities(user),
                user.getEnabled(),
                user.getCreateTime(),
                user.getLastPasswordResetTime()
        );
    }
	/*
	 * private Set getAuthority(User user) { Set authorities = new HashSet<>();
	 * user.getRoles().forEach(role -> { authorities.add(new
	 * SimpleGrantedAuthority("ROLE_" + role.getName())); }); return authorities; }
	 */
}