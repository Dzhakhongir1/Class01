package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.jobTitle="Sdet";
        System.out.println("employee.calculateSalary(55.0) = " + employee.calculateSalary(55.0));
        double annualDevSalary= employee.calculateSalary(55);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor contractor = new Contractor();
        contractor.jobTitle="Developer";
        System.out.println("contractor.calculateSalary(45) = " + contractor.calculateSalary(55));
        System.out.println(contractor.toString());
        System.out.println(employee);

    }
}
