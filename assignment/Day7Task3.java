public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    // Constructor to initialize employee information
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Method to display employee information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        // Create employee objects and print their information
        Employee employee1 = new Employee("John Doe", 2015, 50000, "123 Main St, CityA");
        Employee employee2 = new Employee("Jane Smith", 2018, 60000, "456 Elm St, CityB");
        Employee employee3 = new Employee("Alice Johnson", 2020, 70000, "789 Oak St, CityC");

        System.out.println("Employee Information:");
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
