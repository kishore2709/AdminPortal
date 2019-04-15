package com.springapp.modules.security.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.exception.EntityNotFoundException;
import com.springapp.modules.model.User;
import com.springapp.modules.security.JwtUser;
import com.springapp.modules.security.UserPrincipal;
import com.springapp.modules.security.repository.UserRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String usernameOrEmail)
            throws UsernameNotFoundException {
        // Let people login with either username or email
     
    	User user = userRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
                .orElseThrow(() -> 
                        new UsernameNotFoundException("User not found with username or email : " + usernameOrEmail)
        );
    	 if (user == null) {
             throw new EntityNotFoundException(User.class, "name", usernameOrEmail);
         } else {
             return UserPrincipal.create(user);
         }
    }

    // This method is used by JWTAuthenticationFilter
    public UserDetails loadUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
            () -> new UsernameNotFoundException("User not found with id : " + id)
        );

        return UserPrincipal.create(user);
    }
    
    public UserDetails createJwtUser(User user) {
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword(),
             //   user.getAvatar(),
                user.getEmail()
              /*  user.getPhone(),
                user.getDept().getName(),
                user.getJob().getName(),
                permissionService.mapToGrantedAuthorities(user),
                user.getEnabled(),
                user.getCreateTime(),
                user.getLastPasswordResetTime()*/
        );
    }
	/*
	 * private Set getAuthority(User user) { Set authorities = new HashSet<>();
	 * user.getRoles().forEach(role -> { authorities.add(new
	 * SimpleGrantedAuthority("ROLE_" + role.getName())); }); return authorities; }
	 */
}