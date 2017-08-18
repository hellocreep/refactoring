package replaceConditionalWithPolymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmployeeTest {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    @Test
    public void engineerPaymentTest() throws Exception {
        Employee engineer =  EmployeeCreater.newType(ENGINEER);
        assertThat(engineer.payAmount(), is(5000));
    }

    @Test
    public void salesmanPaymentTest() throws Exception {
        Employee salesman = EmployeeCreater.newType(SALESMAN);
        assertThat(salesman.payAmount(), is(7000));
    }


    @Test
    public void managerPaymentTest() throws Exception {
        Employee manager =  EmployeeCreater.newType(MANAGER);
        assertThat(manager.payAmount(), is(9000));
    }



}