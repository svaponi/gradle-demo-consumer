package io.github.svaponi.consumer;

import org.junit.Test;

public class MainTest {

    @Test
    public void test_findClass() throws ClassNotFoundException {
        Class.forName("io.github.svaponi.osuser.OSUserService");
    }
}
