/**
 * 
 */
package com.gtc.pfm.persistence.repository.mongo.test;

import com.gtc.pfm.domain.Package;
import com.gtc.pfm.domain.User;
import com.gtc.pfm.persistence.repository.user.UserRepository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author stanriku
 *
 */
@ContextConfiguration
public class UserRepositoryTest extends MongoTestBase {

    @Autowired 
    UserRepository repository;
    
    @Before 
    public void setUp() throws Exception {
        super.setUp();
        super.dropCollection(User.class);
        super.createCollection(User.class);
    }

    @Test
    public void testCreateUser() throws Exception {
        List<String> roles = new ArrayList<String>();
        roles.add("user");
        roles.add("admin");
        
        User user = new User("serhattanrikut@gmail.com", "serhattanrikut", "serhattanrikut", "serhat", "tanrikut",
                "st", "st", 6, 6, "m", "Istanbul", "5305467694", "", 5,roles,Calendar.getInstance().getTime(),Calendar.getInstance().getTime());
        
        repository.creaetUser(user);
        
        Assert.assertNotNull(user.getId());
    }
   

    @After 
    public void tearDown() throws Exception {
        super.tearDown();
        repository.deleteAll(Package.class);
    }

}
