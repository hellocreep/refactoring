package replaceConditionalWithPolymorphism;


class Salesman extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}