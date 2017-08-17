package replaceConditionalWithPolymorphism;


public class EngineerType extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary;
    }
}
