class Employee {
    private String name;
    private String id;
    public double salary;
    public boolean isFullTime;
    {
        id = "E123";
        name = "Shuvo";
        System.out.println("A new employee has been added to the office. ");
    }

    void showEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Full time: " + isFullTime);
    }
}

public class Main {
    static public void main(String[] args) {
        Employee E1 = new Employee();

        E1.salary = 50000;
        E1.isFullTime = true;
        E1.showEmployeeDetails();

    }
}