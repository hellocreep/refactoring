package replaceConditionalWithPolymorphism;



class ManagerType extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override public int payAmount(Employee employee) {
        return employee.monthlySalary + employee.bonus;
    }
}