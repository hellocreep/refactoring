package replaceConditionalWithPolymorphism;


class Salesman extends Employee {


    @Override
    public int getTypeCode() {
        return Employee.SALESMAN;
    }

    @Override
    public int payAmount() {
        return this.monthlySalary + this.commission;
    }
}