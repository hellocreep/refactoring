package replaceConditionalWithPolymorphism;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EmplyeeTest {


    @Test
    public void engineerPaymentTest() throws Exception {
        Employee engineer = new Employee(new EngineerType());
        assertThat(engineer.payAmount(), is(5000));
    }

    @Test
    public void salesmanPaymentTest() throws Exception {
        Employee salesman = new Employee(new EngineerType());
        assertThat(salesman.payAmount(), is(7000));
    }


    @Test
    public void managerPaymentTest() throws Exception {
        Employee manager = new Employee(new ManagerType());
        assertThat(manager.payAmount(), is(9000));
    }



}