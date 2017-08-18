package replaceConditionalWithPolymorphism;


public class Engineer extends Employee {

    @Override public int getTypeCode() {
        return Employee.ENGINEER;
    }

    @Override public int payAmount( ) {
        return this.monthlySalary;
    }
}
