package replaceConditionalWithPolymorphism;


class Manager extends Employee {
    @Override
    public int getTypeCode() {
        return Employee.MANAGER;
    }

    @Override
    public int payAmount() {
        return this.monthlySalary + this.bonus;
    }
}