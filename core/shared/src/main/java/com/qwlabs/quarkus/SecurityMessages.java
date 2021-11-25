package com.qwlabs.quarkus;

import org.jboss.logging.annotations.Message;
import org.jboss.logging.annotations.MessageBundle;

import javax.inject.Inject;

import static org.jboss.logging.Messages.getBundle;


@MessageBundle(projectCode = "QWSEC")
public interface SecurityMessages {
    @Inject
    SecurityMessages INSTANCE = getBundle(SecurityMessages.class);

    @Message(value = "User name not found")
    RuntimeException usernameNotFound();
}
