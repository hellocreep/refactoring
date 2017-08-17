package replaceConditionalWithPolymorphism;

public class Employee {
    // ...
    private EmployeeType type;


    public int getTypeCode() {
        return type.getTypeCode();
    }

    int monthlySalary = 5000;
    int commission = 2000;
    int bonus = 4000;

    public Employee(EmployeeType type) {
        this.type = type;
    }

    public int payAmount() {
        return type.payAmount(this);
    }


}