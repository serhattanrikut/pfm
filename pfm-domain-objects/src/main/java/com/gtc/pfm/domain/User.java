/**
 * Copyright 2009 Joe LaPenna
 */

package com.gtc.pfm.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


/**
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
            String hometown, String phone, String photo, int tipCount) {
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
    }
    
    public User(String email, String facebook, String twitter, String firstname, String lastname,
            String username, String password, int followerCount, int friendCount, String gender,
            String hometown, String phone, String photo, int tipCount, Date created, Date updated) {
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
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [email=");
        builder.append(email);
        builder.append(", facebook=");
        builder.append(facebook);
        builder.append(", twitter=");
        builder.append(twitter);
        builder.append(", firstname=");
        builder.append(firstname);
        builder.append(", lastname=");
        builder.append(lastname);
        builder.append(", username=");
        builder.append(username);
        builder.append(", password=");
        builder.append(password);
        builder.append(", followerCount=");
        builder.append(followerCount);
        builder.append(", friendCount=");
        builder.append(friendCount);
        builder.append(", gender=");
        builder.append(gender);
        builder.append(", hometown=");
        builder.append(hometown);
        builder.append(", phone=");
        builder.append(phone);
        builder.append(", photo=");
        builder.append(photo);
        builder.append(", tipCount=");
        builder.append(tipCount);
        builder.append(", id=");
        builder.append(id);
        builder.append(", created=");
        builder.append(created);
        builder.append(", updated=");
        builder.append(updated);
        builder.append("]");
        return builder.toString();
    }
    
}
