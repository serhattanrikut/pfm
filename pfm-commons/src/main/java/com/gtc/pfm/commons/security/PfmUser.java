/**
 * 
 */
package com.gtc.pfm.commons.security;

import com.gtc.pfm.domain.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * Custom user details object for general security purposes. This class is used by spring security
 * in the current implementation but it can be used by any other implementation as well
 * 
 * @author stanriku
 *
 */
public class PfmUser implements UserDetails{

    private static final long serialVersionUID = -731154195541066571L;
    
    private final Set<GrantedAuthority> authorities;
    private final boolean accountNonExpired;
    private final boolean accountNonLocked;
    private final boolean credentialsNonExpired;
    private final boolean enabled;
    
    private User user;
    
    /**
     * @param authorities
     * @param accountNonExpired
     * @param accountNonLocked
     * @param credentialsNonExpired
     * @param enabled
     */
    public PfmUser(Set<GrantedAuthority> authorities, boolean accountNonExpired,
            boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled) {
        super();
        this.authorities = authorities;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
    }
    
    public PfmUser(Set<GrantedAuthority> authorities, boolean accountNonExpired,
            boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled, User user) {
        super();
        this.authorities = authorities;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.user = user;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String getPassword() {
        return user != null ? user.getPassword():null;
    }

    @Override
    public String getUsername() {
        return user != null ? user.getUsername():null;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PfmUser [");
        if (authorities != null) {
            builder.append("authorities=");
            builder.append(authorities);
            builder.append(", ");
        }
        builder.append("accountNonExpired=");
        builder.append(accountNonExpired);
        builder.append(", accountNonLocked=");
        builder.append(accountNonLocked);
        builder.append(", credentialsNonExpired=");
        builder.append(credentialsNonExpired);
        builder.append(", enabled=");
        builder.append(enabled);
        builder.append(", ");
        if (user != null) {
            builder.append("user=");
            builder.append(user);
        }
        builder.append("]");
        return builder.toString();
    }

}
