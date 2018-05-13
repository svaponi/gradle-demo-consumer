package io.github.svaponi.consumer;

import io.github.svaponi.osuser.OSUserService;
import io.github.svaponi.osuser.OSUserServiceFactory;

public class Main {

    public static void main(final String[] args) {

        final OSUserService service = OSUserServiceFactory.getInstance();
        final String username = service.getUser().getUsername();

        System.out.printf("Current OS user: %s \n", username);
    }
}
