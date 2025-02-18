package EmployeeMS;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];
        emp[0] = new FullTimeEmployee("Bob",1,5000);
        emp[1] = new ContractEmployee("Aiatulla",2,15,30);

        for (Employee e: emp){
            e.displayEmployeeInfo();
        }
    }

}
