package replaceConditionalWithPolymorphism;



class Manager extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.bonus;
    }
}