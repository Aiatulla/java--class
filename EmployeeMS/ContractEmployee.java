package EmployeeMS;

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayEmployeeInfo() {
        System.out.println("ID:" + super.id + ", Name: " + super.name + ", Base salary: " + super.baseSalary+ ", Total salary: " +
                calculateSalary());
    }


    @Override
    public double getPaymentAmout() {
        double x = calculateSalary();
        return x;
    }
}
