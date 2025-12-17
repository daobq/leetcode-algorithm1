package algorithm1.ivw;

import algorithm1.common.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportantValue {

    public static void main(String[] args) {

    }
    public int getImportance(List<Employee> employees, int id) {
        // create a map to store the employees by their IDs for efficient lookup
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            employeeMap.put(employee.id, employee);
        }

        // recursively calculate the total importance of the employee and all subordinates
        return calculateImportance(employeeMap, id);
    }

    private int calculateImportance(Map<Integer, Employee> employeeMap, int id) {
        Employee employee = employeeMap.get(id);
        int totalImportance = employee.importance;
        for (int subordinateId : employee.subordinates) {
            totalImportance += calculateImportance(employeeMap, subordinateId);
        }
        return totalImportance;
    }
}
