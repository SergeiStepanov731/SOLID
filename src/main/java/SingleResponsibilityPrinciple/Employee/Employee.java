package SingleResponsibilityPrinciple.Employee;

public class Employee {

    private final int id;
    private final String name;
    private final String department;
    private final boolean working;

    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
