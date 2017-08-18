package replaceConditionalWithPolymorphism;

public abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    int monthlySalary = 5000;
    int commission = 2000;
    int bonus = 4000;


    abstract public int getTypeCode();

    public abstract int payAmount();
}