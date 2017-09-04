package com.thoughtworks.refactoring.pullUpConstructorBody;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void descriptionOfEmployee() throws Exception {
        Employee employee = new Employee();

        assertEquals(employee.description(), "name: employee, id: a");
    }
}
