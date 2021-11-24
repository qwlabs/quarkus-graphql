package com.qwlabs.quarkus;


import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageBundle;

@MessageBundle
public interface SecurityMessages {

    @Message(value = "User name not found")
    String usernameNotFound();
}
