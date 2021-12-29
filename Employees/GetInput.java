package Exercises.Employees;


import java.util.List;
import java.util.Scanner;

class GetInput {

    static Scanner scanner = new Scanner(System.in);

    static int getInt(String message, int min, int max) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty!");
                } else {
                    int inputInt = Integer.parseInt(input);
                    if (min <= inputInt && inputInt <= max) {
                        return inputInt;
                    } else {
                        System.out.println("Input must be in range " + min + " to " + max);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input an integer number!");
            }
        }
    }

    static String getString(String message, String regex) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
            } else {
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println("Invalid!");
                }
            }
        }
    }

    static int getID(List<Employee> list) {
        while (true) {
            int id = getInt("ID: ", 1, Integer.MAX_VALUE);
            if (!checkIDExist(id, list)) {
                return id;
            } else {
                System.out.println(id + " already in use!");
            }
        }
    }

    static double getSalary() {
        while (true) {
            System.out.print("Salary: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty!");
            } else {
                try {
                    double salary = Double.parseDouble(input);
                    if (salary > 0) {
                        return salary;
                    } else {
                        System.out.print("Salary must more than 0!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Salary must be a numberical value!");
                }
            }
        }
    }

    private static boolean checkIDExist(int id, List<Employee> list) {
        if (list.isEmpty()) {
            return false;
        }
        return list.stream().anyMatch((employee) -> (employee.getId() == id));
    }

    static boolean checkYesNo() {
        String result = GetInput.getString("Do you want to continue (Y/N)? ", "^[yYnN]$");
        if (result.equalsIgnoreCase("y")) {
            System.out.println();
            return true;
        }
        return false;
    }

    static double getDouble(String message, float min, float max) {
        while (true) {
            System.out.print(message);
            try {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty!");
                } else {
                    double inputDouble = Double.parseDouble(input);
                    if (min <= inputDouble && inputDouble <= max) {
                        return inputDouble;
                    } else {
                        System.out.println("Input must be in range " + min + " to " + max);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Input a double number!");
            }
        }
    }

}
