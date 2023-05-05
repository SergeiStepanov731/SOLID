package SingleResponsibilityPrinciple.Employee;

public class ClientModel {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "iF", "CEO", true);
        ClientModel.hireNewEmployee(e1);
        ClientModel.printEmployeeReport(e1, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        var formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }

}
