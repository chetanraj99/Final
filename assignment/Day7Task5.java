import java.util.Scanner;

public class Employee {
    double salary;
    int hoursOfWork;

    // Method to get information about salary and hours of work per day
    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    // Method to add $10 to salary if it is less than $500
    public void AddSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add $5 to salary if the number of hours of work per day is more than 6 hours
    public void AddWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    // Method to print the final salary
    public void printFinalSalary() {
        System.out.println("Final salary: $" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salary and hours of work per day from the user
        System.out.print("Enter salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();

        // Create an object of Employee class
        Employee employee = new Employee();

        // Call getInfo() method to set salary and hours of work
        employee.getInfo(salary, hoursOfWork);

        // Call AddSal() and AddWork() methods
        employee.AddSal();
        employee.AddWork();

        // Print the final salary
        employee.printFinalSalary();

        scanner.close();
    }
}
