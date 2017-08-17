package replaceConditionalWithPolymorphism;


public class Engineer extends EmployeeType {
    @Override public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
