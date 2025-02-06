import java.util.*;

public class Main {

    // Employee Class
    static class Employee {
        int id;
        String name;
        double salary;

        public Employee() {}

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }
    }

    // CollectionMap Class
    static class CollectionMap {
        private Map<Integer, Employee> employeeMap;

        // Default constructor initializing the map
        public CollectionMap() {
            employeeMap = new HashMap<>();
        }

        // Getter and Setter for employeeMap
        public Map<Integer, Employee> getEmployeeMap() {
            return employeeMap;
        }

        public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
            this.employeeMap = employeeMap;
        }

        // Method to add an employee to the map
        public int addEmployee(Employee emp) {
            if (emp == null) {
                return 1; // Error: Null employee
            }

            if (employeeMap.containsKey(emp.getId())) {
                return 2; // Error: Duplicate employee ID
            }

            employeeMap.put(emp.getId(), emp);
            return 0; // Success
        }

        // Method to remove an employee by ID
        public int removeEmployee(int employeeId) {
            if (!employeeMap.containsKey(employeeId)) {
                return 2; // Error: Employee not found
            }

            employeeMap.remove(employeeId);
            return 0; // Success
        }

        // Method to find an employee by ID
        public Employee findEmployee(int employeeId) {
            return employeeMap.get(employeeId); // Returns null if not found
        }

        // Method to get all employees as a list
        public List<Employee> getEmployeeList() {
            if (employeeMap.isEmpty()) {
                return null; // Error: Map is empty
            }

            return new ArrayList<>(employeeMap.values());
        }
    }

    // TestEmployee Class to test the functionality
    public static void main(String[] args) {
        // Create a new CollectionMap object
        CollectionMap collectionMap = new CollectionMap();

        // Create Employee objects
        Employee emp1 = new Employee(101, "Alice", 50000);
        Employee emp2 = new Employee(102, "Bob", 60000);
        Employee emp3 = new Employee(103, "Charlie", 70000);

        // Add employees to the map
        System.out.println("Add emp1: " + collectionMap.addEmployee(emp1)); // 0 (success)
        System.out.println("Add emp2: " + collectionMap.addEmployee(emp2)); // 0 (success)
        System.out.println("Add emp3: " + collectionMap.addEmployee(emp3)); // 0 (success)

        // Add a duplicate employee
        Employee emp4 = new Employee(102, "David", 80000);
        System.out.println("Add emp4 (duplicate ID): " + collectionMap.addEmployee(emp4)); // 2 (duplicate)

        // Find employee by ID
        Employee foundEmployee = collectionMap.findEmployee(102);
        System.out.println("Found employee with ID 102: " + (foundEmployee != null ? foundEmployee : "Not found"));

        // Remove an employee
        System.out.println("Remove emp2: " + collectionMap.removeEmployee(102)); // 0 (success)

        // Try to remove an employee that doesn't exist
        System.out.println("Remove emp2 again: " + collectionMap.removeEmployee(102)); // 2 (not found)

        // Get list of all employees
        List<Employee> employeeList = collectionMap.getEmployeeList();
        if (employeeList != null) {
            System.out.println("All employees: ");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        } else {
            System.out.println("No employees found.");
        }
    }
}