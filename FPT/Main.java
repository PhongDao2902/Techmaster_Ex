package Exercises.FPT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ProductRepository productRepository = new ProductRepository();
        productRepository.productList();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Lọc sản phẩm: ");
            Menu.choose();
            System.out.println("Nhập lựa chọn của bạn: ");
            int chooseMenu = Integer.parseInt(scan.nextLine());
            switch (chooseMenu) {
                case 1:
                    Menu.chooseCategory();
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int chooseCategory = Integer.parseInt(scan.nextLine());
                    switch (chooseCategory) {
                        case 1:
                            productRepository.getProductByCategory("điện thoại");
                            productRepository.printProductByCategory("điện thoại");
    
                            break;
                        case 2:
                            productRepository.getProductByCategory("laptop");
                            productRepository.printProductByCategory("laptop");
                            break;
                        case 3:
                            productRepository.getProductByCategory("apple");
                            productRepository.printProductByCategory("apple");
                            break;
                        case 4:
                            productRepository.getProductByCategory("phụ kiện");
                            productRepository.printProductByCategory("phụ kiện");
                            break;
                        default:
                            System.out.println("Lựa chọn của bạn không tồn tại!");
                    }
                    break;
    
                case 2:
                    System.out.println("Nhập vào hãng bạn muốn tìm kiếm: ");
                    String brand = scan.nextLine();
                    productRepository.getProductByBrand(brand);
                    break;
    
                case 3:
                    Menu.chooseCategory();
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int chooseCategoryAndPrice = Integer.parseInt(scan.nextLine());
                    switch (chooseCategoryAndPrice) {
                        case 1:
                            productRepository.getProductByCategoryAndPrice("điện thoại");
                            break;
                        case 2:
                            productRepository.getProductByCategoryAndPrice("laptop");
                            break;
                        case 3:
                            productRepository.getProductByCategoryAndPrice("apple");
                            break;
                        case 4:
                            productRepository.getProductByCategoryAndPrice("phụ kiện");
                            break;
                        default:
                            System.out.println("Lựa chọn của bạn không tồn tại!");
                    }
                    break;
    
                case 4:
                    System.out.println("Nhập vào tên sản phẩm bạn muốn tìm kiếm: ");
                    String name = scan.nextLine();
                    productRepository.searchByNameProduct(name);
                    break;
                case 5:
                    System.exit(chooseMenu);
                    break;
    
                default:
                    System.out.println("Lựa chọn của bạn không tồn tại!");
            }
        }
    }

}
