package Exercises.Generics;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonController<Student> student = new PersonController<Student>();
        Student student1 = new Student(1l, "Phong", 20, 7.5);
        Student student2 = new Student(2l, "Thắng", 17, 9.5);
        student.add(student1);
        student.add(student2);
        System.out.println("Danh sách học sinh: ");
        student.display();
        System.out.println("Danh sách học sinh có điểm lớn hơn 8: ");
        student.list.stream().filter(students -> students.getPoint() > 8).forEach(System.out::println);
        PersonController<Teacher> teachers = new PersonController<Teacher>();
        Teacher teacher1 = new Teacher(1L, "Ngọc", 9000000);
        Teacher teacher2 = new Teacher(2L, "Cường", 10000000);
        teachers.add(teacher1);
        teachers.add(teacher2);
        System.out.println("Danh sách giảng viên: ");
        teachers.display();
    }
}