package replaceConditionalWithPolymorphism;



class Manager extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}