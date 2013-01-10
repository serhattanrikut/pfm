/**
 * Copyright 2009 Joe LaPenna
 */

package com.gtc.pfm.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;


/**
 * User class holding all required properties including roles.
 * 
 * @author stanriku
 */
@Document
public class User extends PfmMongoDomainObject{

    public static final String usernameField = "un";
    
    private String email;
    private String facebook;
    private String twitter;
    private String firstname;
    private String lastname;
    
    @Field(value=usernameField)
    private String username;
    
    private String password;
    private int followerCount;
    private int friendCount;
    private String gender;
    private String hometown;
    private String phone;
    private String photo;
    private int tipCount;
    
    private List<String> roles;

    /**
     * default constructor
     */
    public User() {
        
    }
    
    /**
     * @param email
     * @param facebook
     * @param twitter
     * @param firstname
     * @param lastname
     * @param username
     * @param password
     * @param followerCount
     * @param friendCount
     * @param gender
     * @param hometown
     * @param phone
     * @param photo
     * @param tipCount
     */
    public User(String email, String facebook, String twitter, String firstname, String lastname,
            String username, String password, int followerCount, int friendCount, String gender,
            String hometown, String phone, String photo, int tipCount, List<String> roles) {
        super();
        this.email = email;
        this.facebook = facebook;
        this.twitter = twitter;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.followerCount = followerCount;
        this.friendCount = friendCount;
        this.gender = gender;
        this.hometown = hometown;
        this.phone = phone;
        this.photo = photo;
        this.tipCount = tipCount;
        this.roles = roles;
    }
    
    public User(String email, String facebook, String twitter, String firstname, String lastname,
            String username, String password, int followerCount, int friendCount, String gender,
            String hometown, String phone, String photo, int tipCount, List<String> roles, Date created, Date updated) {
        super();
        this.email = email;
        this.facebook = facebook;
        this.twitter = twitter;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.followerCount = followerCount;
        this.friendCount = friendCount;
        this.gender = gender;
        this.hometown = hometown;
        this.phone = phone;
        this.photo = photo;
        this.tipCount = tipCount;
        this.created = created;
        this.updated = updated;
        this.roles = roles;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the twitter
     */
    public String getTwitter() {
        return twitter;
    }

    /**
     * @param twitter the twitter to set
     */
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the followerCount
     */
    public int getFollowerCount() {
        return followerCount;
    }

    /**
     * @param followerCount the followerCount to set
     */
    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    /**
     * @return the friendCount
     */
    public int getFriendCount() {
        return friendCount;
    }

    /**
     * @param friendCount the friendCount to set
     */
    public void setFriendCount(int friendCount) {
        this.friendCount = friendCount;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the tipCount
     */
    public int getTipCount() {
        return tipCount;
    }

    /**
     * @param tipCount the tipCount to set
     */
    public void setTipCount(int tipCount) {
        this.tipCount = tipCount;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * @return the roles
     */
    public List<String> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    /**
     * 
     * creates {@link UserReference} instance generated from the current {@link User} object
     * 
     * @return {@link UserReference}
     */
    public UserReference exposeUserRef() {
        
        UserReference userRef = new UserReference(this.getId(), this.getUsername());
        return userRef;
        
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((facebook == null) ? 0 : facebook.hashCode());
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        result = prime * result + followerCount;
        result = prime * result + friendCount;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((hometown == null) ? 0 : hometown.hashCode());
        result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((photo == null) ? 0 : photo.hashCode());
        result = prime * result + ((roles == null) ? 0 : roles.hashCode());
        result = prime * result + tipCount;
        result = prime * result + ((twitter == null) ? 0 : twitter.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (facebook == null) {
            if (other.facebook != null) {
                return false;
            }
        } else if (!facebook.equals(other.facebook)) {
            return false;
        }
        if (firstname == null) {
            if (other.firstname != null) {
                return false;
            }
        } else if (!firstname.equals(other.firstname)) {
            return false;
        }
        if (followerCount != other.followerCount) {
            return false;
        }
        if (friendCount != other.friendCount) {
            return false;
        }
        if (gender == null) {
            if (other.gender != null) {
                return false;
            }
        } else if (!gender.equals(other.gender)) {
            return false;
        }
        if (hometown == null) {
            if (other.hometown != null) {
                return false;
            }
        } else if (!hometown.equals(other.hometown)) {
            return false;
        }
        if (lastname == null) {
            if (other.lastname != null) {
                return false;
            }
        } else if (!lastname.equals(other.lastname)) {
            return false;
        }
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        if (phone == null) {
            if (other.phone != null) {
                return false;
            }
        } else if (!phone.equals(other.phone)) {
            return false;
        }
        if (photo == null) {
            if (other.photo != null) {
                return false;
            }
        } else if (!photo.equals(other.photo)) {
            return false;
        }
        if (roles == null) {
            if (other.roles != null) {
                return false;
            }
        } else if (!roles.equals(other.roles)) {
            return false;
        }
        if (tipCount != other.tipCount) {
            return false;
        }
        if (twitter == null) {
            if (other.twitter != null) {
                return false;
            }
        } else if (!twitter.equals(other.twitter)) {
            return false;
        }
        if (username == null) {
            if (other.username != null) {
                return false;
            }
        } else if (!username.equals(other.username)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [");
        if (email != null) {
            builder.append("email=");
            builder.append(email);
            builder.append(", ");
        }
        if (facebook != null) {
            builder.append("facebook=");
            builder.append(facebook);
            builder.append(", ");
        }
        if (twitter != null) {
            builder.append("twitter=");
            builder.append(twitter);
            builder.append(", ");
        }
        if (firstname != null) {
            builder.append("firstname=");
            builder.append(firstname);
            builder.append(", ");
        }
        if (lastname != null) {
            builder.append("lastname=");
            builder.append(lastname);
            builder.append(", ");
        }
        if (username != null) {
            builder.append("username=");
            builder.append(username);
            builder.append(", ");
        }
        if (password != null) {
            builder.append("password=");
            builder.append(password);
            builder.append(", ");
        }
        builder.append("followerCount=");
        builder.append(followerCount);
        builder.append(", friendCount=");
        builder.append(friendCount);
        builder.append(", ");
        if (gender != null) {
            builder.append("gender=");
            builder.append(gender);
            builder.append(", ");
        }
        if (hometown != null) {
            builder.append("hometown=");
            builder.append(hometown);
            builder.append(", ");
        }
        if (phone != null) {
            builder.append("phone=");
            builder.append(phone);
            builder.append(", ");
        }
        if (photo != null) {
            builder.append("photo=");
            builder.append(photo);
            builder.append(", ");
        }
        builder.append("tipCount=");
        builder.append(tipCount);
        builder.append(", ");
        if (roles != null) {
            builder.append("roles=");
            builder.append(roles);
        }
        builder.append("]");
        return builder.toString();
    }
    
}
