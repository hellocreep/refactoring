package replaceConditionalWithPolymorphism;

public class EmployeeCreater {


    public static Employee newType(int code) {
        switch (code) {
            case Employee.ENGINEER:
                return new Engineer();
            case Employee.SALESMAN:
                return new Salesman();
            case Employee.MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

}