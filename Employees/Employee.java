package Exercises.Employees;


public abstract class Employee {

    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private double rawSalary;

    public Employee(int id, String name, int age, String phone, String email, double rawSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.rawSalary = rawSalary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getRawSalary() {
        return rawSalary;
    }

    public void setRawSalary(double rawSalary) {
        this.rawSalary = rawSalary;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return String.format("%-5s%-20s%-5s%-15s%-15s%10s", id, name, age, phone, email, getSalary());
    }

}
