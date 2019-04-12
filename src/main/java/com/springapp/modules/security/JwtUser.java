package com.springapp.modules.security;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtUser implements UserDetails {

	/*
	 using lambok API we can have final variables without initialization
	 
	 @Getter
@AllArgsConstructor
 private final Long id;

    private final String username;
	 */
    @JsonIgnore
    private Long id;

    public JwtUser(Long id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	private String username;

    @JsonIgnore
    private String password;

    private String avatar;

    private String email;

    private String phone;

    private String dept;

    private String job;

    @JsonIgnore
    private Collection<GrantedAuthority> authorities;

    private boolean enabled;

    private Timestamp createTime;

    @JsonIgnore
    private Date lastPasswordResetDate;

    public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Long getId() {
		return id;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getDept() {
		return dept;
	}

	public String getJob() {
		return job;
	}

	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	@JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public Collection getRoles() {
        return authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toSet());
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
}