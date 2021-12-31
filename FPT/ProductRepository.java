package Exercises.FPT;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {
    Category phone = Category.PHONE;
    Category laptop = Category.LAPTOP;
    Category apple = Category.APPLE;
    Category accessories = Category.ACCESSORIES;
    ArrayList<Products> productList = new ArrayList<>();
    ArrayList<Products> listByCategory = new ArrayList<>();

    public void productList() {

        productList.add(new Products("01", "Oppo Reno5", "Oppo Reno5 8GB-128GB", 8390000, 10, 7, "OPPO", phone));
        productList.add(new Products("02", "Oppo Reno4", "Oppo Reno4 CPU 2x2.3 Ghz & 6x1.8 Ghz", 11490000, 25, 10,
                "OPPO", phone));
        productList
                .add(new Products("03", "Samsung Galaxy Z", "Samsung Galaxy Z Flip", 10990000, 10, 3, "Samsung", phone));
        productList.add(new Products("04", "Oppo A92", "Oppo A92", 5990000, 30, 15, "OPPO", phone));
        productList
                .add(new Products("05", "Asus Zenbook", "Asus Zenbook UX325EA-EG079T", 20790000, 10, 6, "Asus", laptop));
        productList.add(new Products("06", "Dell G3", "Dell G3 15 i5 10300H", 21840000, 15, 4, "Dell", laptop));
        productList.add(new Products("07", "Dell Inspiron N7501", "Dell Inspiron N7501 i7 10750H", 28970000, 10, 1,
                "Dell", laptop));
        productList.add(new Products("08", "iPhone 12", "iPhone 12 Pro Max 128GB", 30990000, 5, 2, "iPhone", apple));
        productList.add(new Products("09", "MacBook Air", "MacBook Air 13' 2020 M1 16GB/256GB", 33990000, 20, 4,
                "MacBook", apple));
        productList.add(new Products("10", "Loa bluetooth Compact 2", "Loa bluetooth Compact 2", 290000, 20, 15,
                "Xiaomi", accessories));
        productList.add(new Products("11", "Loa bluetooth i.value BT116", "Loa bluetooth i.value BT116", 490000, 30, 10,
                "i.value", accessories));
        productList.add(new Products("12", "Pin sạc dự phòng Ultra Compact",
                "Pin sạc dự phòng 10000mAh Mi Ultra Compact", 710000, 30, 10, "Xiaomi", accessories));
        productList.add(new Products("13", "Vivo Y20", "Vivo Y20 4GB-64GB", 3690000, 15, 10, "Vivo", phone));
        productList
                .add(new Products("14", "Xiaomi Redmi 9", "Xiaomi Redmi 9 4GB-64GB", 2990000, 30, 25, "Xiaomi", phone));
    }

    public void getProductByCategory(String category) {
        listByCategory = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCategory().getValue().equalsIgnoreCase(category)) {
                listByCategory.add(productList.get(i));
            }
        }
    }

    public void printProductByCategory(String category) {
        if (listByCategory.size() != 0) {
            System.out.println("Danh sách sản phẩm thuộc danh mục " + category + ": ");
            for (Products product : listByCategory) {
                System.out.println(product);
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm nào thuộc danh mục " + category);
        }
    }

    public void getProductByBrand(String brand) {
        Boolean isCheck = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getBrand().equalsIgnoreCase(brand)) {
                isCheck = true;
                break;
            }
        }
        if (isCheck) {
            System.out.println("Danh sách sản phẩm hãng " + brand + ": ");
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getBrand().equalsIgnoreCase(brand)) {
                    System.out.println(productList.get(i));
                }
            }
        } else {
            System.out.println("Không tìm thấy sản phẩm nào thuộc hãng " + brand);
        }
    }

    public void getProductByCategoryAndPrice(String category) {
        getProductByCategory(category);
        Scanner scan = new Scanner(System.in);
        Menu.choosePrice();
        System.out.println("Nhập lựa chọn của bạn: ");
        int choose = Integer.parseInt(scan.nextLine());
        System.out.println("Danh sách sản phẩm bạn cần tìm: ");
        int count = 0;
        switch (choose) {
            case 1:
                for (int i = 0; i < listByCategory.size(); i++) {
                    if (listByCategory.get(i).getPrice() < 2000000) {
                        System.out.println(listByCategory.get(i));
                        count++;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < listByCategory.size(); i++) {
                    long price = listByCategory.get(i).getPrice();
                    if (price >= 2000000 && price < 4000000) {
                        System.out.println(listByCategory.get(i));
                        count++;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < listByCategory.size(); i++) {
                    long price = listByCategory.get(i).getPrice();
                    if (price >= 4000000 && price < 7000000) {
                        System.out.println(listByCategory.get(i));
                        count++;
                    }
                }
                break;
            case 4:
                for (int i = 0; i < listByCategory.size(); i++) {
                    long price = listByCategory.get(i).getPrice();
                    if (price >= 7000000 && price <= 13000000) {
                        System.out.println(listByCategory.get(i));
                        count++;
                    }
                }
                break;
            case 5:
                for (int i = 0; i < listByCategory.size(); i++) {
                    long price = listByCategory.get(i).getPrice();
                    if (price > 13000000) {
                        System.out.println(listByCategory.get(i));
                        count++;
                    }
                }
                break;
            default:
                System.out.println("Lựa chọn của bạn không tồn tại!");
        }

        if (count == 0) {
            System.out.println("Không tồn tại sản phẩm này!");
        }
    }

    public void searchByNameProduct(String name) {
        int count = 0;
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(productList.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại sản phẩm này!");
        }
    }

}
