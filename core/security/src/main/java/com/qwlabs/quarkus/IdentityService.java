package com.qwlabs.quarkus;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class IdentityService {
    private SecurityMessages securityMessages;

    @Inject
    public IdentityService(SecurityMessages securityMessages) {
        this.securityMessages = securityMessages;
    }


    public String login() {
        return securityMessages.usernameNotFound();
    }
}
