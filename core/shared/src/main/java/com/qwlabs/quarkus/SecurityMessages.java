package com.qwlabs.quarkus;

import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;


@MessageBundle(projectCode = "QWSEC")
public interface SecurityMessages {

    @Message(value = "User name not found")
    RuntimeException usernameNotFound();
}
