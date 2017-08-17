package replaceConditionalWithPolymorphism;

public class Employee {
    // ...
    private EmployeeType type;



    public int getTypeCode() {
        return type.getTypeCode();
    }

    private int monthlySalary = 5000;
    private int commission = 2000;
    private int bonus = 4000;

    public Employee(EmployeeType type) {
        this.type = type;
    }

    public int payAmount() {
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return monthlySalary;
            case EmployeeType.SALESMAN:
                return monthlySalary + commission;
            case EmployeeType.MANAGER:
                return monthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee Code");
        }
    }


}