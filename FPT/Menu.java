package Exercises.FPT;

public class Menu {
    public static void choose(){
        System.out.println("1: Hiển thị thông tin dựa trên danh mục");
        System.out.println("2: Hiển thị thông tin dựa theo hãng");
        System.out.println("3: Hiển thị thông tin theo danh mục và mức giá");
        System.out.println("4: Tìm kiếm sản phẩm");
        System.out.println("5: Thoát chương trình");
    }

    public static void chooseCategory(){
        System.out.println("Lựa chọn danh mục: ");
        System.out.println("1: Điện thoại");
        System.out.println("2: Laptop");
        System.out.println("3: Apple");
        System.out.println("4: Phụ kiện");

    }
    public static void choosePrice(){
        System.out.println("Chọn mức giá: ");
        System.out.println("1: Dưới 2 triệu");
        System.out.println("2: Từ 2 đến dưới 4 triệu");
        System.out.println("3: Từ 4 đến dưới 7 triệu");
        System.out.println("4: Từ 7 đến 13 triệu");
        System.out.println("5: Trên 13 triệu");
    }
}
