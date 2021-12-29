package Exercises.Employees;


public class Tester extends Employee {

    private int error;

    public Tester(int id, String name, int age, String phone, String email, double rawSalary, int error) {
        super(id, name, age, phone, email, rawSalary);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    @Override
    public double getSalary() {
        return getRawSalary() + error * 50000;
    }

    @Override
    public String toString() {
        return String.format("%-5s%-70s%5s", "Test", super.toString(), error);
    }

}
