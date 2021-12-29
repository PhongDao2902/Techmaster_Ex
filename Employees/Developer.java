package Exercises.Employees;


public class Developer extends Employee {

    private double overTime;

    public Developer(int id, String name, int age, String phone, String email, double rawSalary, double overTime) {
        super(id, name, age, phone, email, rawSalary);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public double getSalary() {
        return getRawSalary() + overTime * 200000;
    }

    @Override
    public String toString() {
        return String.format("%-5s%-70s%5s", "Dev", super.toString(), overTime);
    }

}
