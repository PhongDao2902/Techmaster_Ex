package Exercises.Employees;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        while (true) {
            addEmployee(list);
            if (!GetInput.checkYesNo()) {
                break;
            }
        }
        displayList(list);
    }

    private static void addEmployee(List<Employee> list) {
        int id = GetInput.getID(list);
        String name = GetInput.getString("Name: ", "[A-Za-z ]+");
        int age = GetInput.getInt("Age: ", 0, 100);
        String phone = GetInput.getString("Phone: ", "0[0-9]{9}");
        String email = GetInput.getString("Email: ", "^[a-zA-Z]+[a-z0-9A-Z]+@[a-zA-Z]+[a-z0-9A-Z]+(\\.[a-zA-Z]+){1,3}+$");
        double rawSalary = GetInput.getSalary();
        int choice = GetInput.getInt("Type (0-Dev, 1-Tester): ", 0, 1);
        switch(choice){
            case 0:
                double overTime = GetInput.getDouble("Over Time: ", 0, 1000000);
                list.add(new Developer(id, name, age, phone, email, rawSalary, overTime));
                break;
            case 1:
                int error = GetInput.getInt("Detected Error: ", 0, 1000000);
                list.add(new Tester(id, name, age, phone, email, rawSalary, error));
                break;
        }
        System.err.println("Add successfully!\n");
    }

    private static void displayList(List<Employee> list) {
        System.out.println(String.format("%-5s%-5s%-20s%-5s%-15s%-15s%10s%-5s", "Type", "ID", "Name", "Age", "Phone", "Email", "Salary", "Other"));
        for (Employee employee : list) {
            System.out.println(employee);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
