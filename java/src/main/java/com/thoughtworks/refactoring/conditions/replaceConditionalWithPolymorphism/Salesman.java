package replaceConditionalWithPolymorphism;


class Salesman extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.commission;
    }
}