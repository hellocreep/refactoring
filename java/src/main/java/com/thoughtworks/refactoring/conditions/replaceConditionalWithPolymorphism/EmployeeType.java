package replaceConditionalWithPolymorphism;

public abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract public int getTypeCode();
    public static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

    public int payAmount(Employee employee) {
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return employee.monthlySalary;
            case EmployeeType.SALESMAN:
                return employee.monthlySalary + employee.commission;
            case EmployeeType.MANAGER:
                return employee.monthlySalary + employee.bonus;
            default:
                throw new RuntimeException("Incorrect Employee Code");
        }
    }
}