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
        
        User user = new User("serhattanrikut@gmail.com", "serhattanrikut", "serhattanrikut", "serhat", "tanrikut",
                "st", "st", 6, 6, "m", "Istanbul", "5305467694", "", 5);
        
        repository.creaetUser(user);
        
        Assert.assertNotNull(user.getId());
    }
    

    @After 
    public void tearDown() throws Exception {
        super.tearDown();
        repository.deleteAll(Package.class);
    }

}
