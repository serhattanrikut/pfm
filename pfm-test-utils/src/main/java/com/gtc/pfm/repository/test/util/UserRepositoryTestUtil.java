/**
 * 
 */
package com.gtc.pfm.repository.test.util;

import com.gtc.pfm.domain.User;
import com.gtc.pfm.domain.UserReference;

import org.bson.types.ObjectId;

import java.util.Date;
import java.util.List;

/**
 * provides mock implementations and util methods in order to mock {@link User} 
 * 
 * @author stanriku
 *
 */
public class UserRepositoryTestUtil {

    /**
     * 
     */
    public UserRepositoryTestUtil() {
        
    }
    
    /**
     * 
     * creates a in-memory mock {@link User}
     * 
     * @param username
     * @param password
     * @param tipCount
     * @param firstname
     * @param lastname
     * @param friendCount
     * @param twitter
     * @param email
     * @param phone
     * @param followerCount
     * @param facebook
     * @param photo
     * @param gender
     * @param hometown
     * @param roles
     * @return {@link User}
     */
    public User createUserMock(String username, String password, int tipCount, String firstname, String lastname, int friendCount, String twitter, 
            String email, String phone, int followerCount, String facebook, String photo, String gender, String hometown,List<String> roles) {
       
        User user = new User(email, facebook, twitter, firstname, lastname, username, password, followerCount, friendCount, gender, hometown, phone, photo, tipCount,roles);
        
        return user;
    }
    
    /**
     * 
     * creates a in-memory mock {@link User}
     * 
     * @param username
     * @param password
     * @param tipCount
     * @param firstname
     * @param lastname
     * @param friendCount
     * @param twitter
     * @param email
     * @param phone
     * @param followerCount
     * @param facebook
     * @param photo
     * @param gender
     * @param hometown
     * @param roles
     * @param created
     * @param updated
     * 
     * @return {@link User}
     */
    public User createUserMock(String username, String password, int tipCount, String firstname, String lastname, int friendCount, String twitter, 
            String email, String phone, int followerCount, String facebook, String photo, String gender, String hometown, List<String> roles, Date created, Date updated) {
        
        User user = new User(email, facebook, twitter, firstname, lastname, username, password, followerCount, 
                friendCount, gender, hometown, phone, photo, tipCount, roles, created, updated);
        
        return user;
    }
    
    /**
     * 
     * creates a in-memory mock {@link User} with {@link ObjectId}
     * 
     * @param id
     * @param username
     * @param password
     * @param tipCount
     * @param firstname
     * @param lastname
     * @param friendCount
     * @param twitter
     * @param email
     * @param phone
     * @param followerCount
     * @param facebook
     * @param photo
     * @param gender
     * @param hometown
     * @param roles
     * @param created
     * @param updated
     * 
     * @return {@link User}
     */
    public User createUserMock(String id, String username, String password, int tipCount, String firstname, String lastname, int friendCount, String twitter, 
            String email, String phone, int followerCount, String facebook, String photo, String gender, String hometown, List<String> roles, Date created, Date updated) {
        
        User user = createUserMock(username, password, tipCount, firstname, lastname, friendCount, 
                twitter, email, phone, followerCount, facebook, photo, gender, hometown, roles,created, updated);
        
        user.setId(id);
        
        return user;
    }
    
    /**
     * creates a in-memory mock {@link UserReference}
     * 
     * @param id 
     * @param name 
     * 
     * @return {@link UserReference}
     */
    public UserReference createUserReferenceMock(String id, String name) {
        
        UserReference UserReference = new UserReference(id, name);
        
        return UserReference;
    }
    
    /**
     * creates a in-memory mock {@link UserReference}
     * 
     * @param id 
     * @param name 
     * 
     * @return {@link UserReference}
     */
    public UserReference createUserReferenceMock(User user) {
        
        UserReference UserReference = user.exposeUserRef();
        
        return UserReference;
    }

}
