package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void userWithDefaultUsernameAndPassword() {
        User utilizator = new User("admin", "P@ssword!");
        Assert.assertEquals("username I expect to see", "admin", utilizator.getUsername());
        Assert.assertEquals("password I expect to see", "P@ssword!", utilizator.getPassword());
    }

    @Test
    public void setPasswordAfterConstructed() {
        User utilizator = new User();

        utilizator.setPassword("P@ssword!");

        Assert.assertEquals("Set password expected here", "P@ssword!", utilizator.getPassword());
    }
}
