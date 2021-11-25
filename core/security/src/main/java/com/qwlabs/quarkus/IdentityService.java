package com.qwlabs.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IdentityService {
    
    public String login() {
        throw SecurityMessages.INSTANCE.usernameNotFound();
    }
}
