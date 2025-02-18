package EmployeeMS;

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }


    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }

    @Override
    public double getPaymentAmout() {
        double x = calculateSalary();
        return x;
    }
    public void displayEmployeeInfo() {
        System.out.println("ID:" + super.id + ", Name: " + super.name + ", Base salary: " + super.baseSalary+ ", Total salary: " +
                calculateSalary() + ", Extra benefits : Free health insure");
    }
}
