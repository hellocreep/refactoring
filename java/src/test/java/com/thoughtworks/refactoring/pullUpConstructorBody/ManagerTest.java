package com.thoughtworks.refactoring.pullUpConstructorBody;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    @Test
    public void descriptionOfManager() throws Exception {
        Manager manager = new Manager("manager", "b", 1);

        assertEquals(manager.description(), "name: manager, id: b, grade: 1");
    }
}
