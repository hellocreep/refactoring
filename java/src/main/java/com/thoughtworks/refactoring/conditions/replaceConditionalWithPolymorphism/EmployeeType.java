package replaceConditionalWithPolymorphism;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract public int getTypeCode();

    public abstract int payAmount(Employee employee);
}