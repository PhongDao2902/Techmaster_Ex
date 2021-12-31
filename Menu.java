package Exercises;

import java.util.*;


public class Menu {
    public static void main(String[] args) {
        while (true) {
            try (Scanner scan = new Scanner(System.in)) {
                ArrayList<Integer> ItemCode = new ArrayList<Integer>();
                ArrayList<String> ItemName = new ArrayList<String>();
                ArrayList<String> Itemtype = new ArrayList<String>();
                ArrayList<Integer> Amount = new ArrayList<Integer>();
                ArrayList<Integer> Price = new ArrayList<Integer>();
                ArrayList<Integer> NoSold = new ArrayList<Integer>();
                System.out.println("1 - Xem sản phẩm");
                System.out.println("2 - Thêm mới sản phẩm");
                System.out.println("3 - Tìm sản phẩm theo mã sản phẩm và sửa sản phẩm đó");
                System.out.println("4 - Tìm sản phẩm theo mã sản phẩm và xoá sản phẩm đó");
                System.out.println("5 - Xem sản phẩm và số lượng bán được");
                System.out.println("6 - Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó");
                System.out.println("7 - Sắp xếp sản phẩm theo tên");
                String selection = Select("Bạn chọn: ");
                ArrayList<String> ClearType;
                switch (selection) {
                    case "0":
                        System.exit(0);
                    case "1":
                        for (int i = 0; i < ItemCode.size(); i++) {
                            System.out.println((i+1) + "-" + ItemCode.get(i) + "-" + ItemName.get(i) + "-" + 
                            Itemtype.get(i) + "-" + Amount.get(i) + "-" + Price.get(i) + "-" + NoSold.get(i));
                        }
                        break;
                    case "2":
                        System.out.print("Mã sản phẩm: ");
                        int CodeIn = scan.nextInt();
                        scan.nextLine();
                        ItemCode.add(CodeIn);
                        System.out.print("Tên sản phẩm: ");
                        String NameIn = scan.nextLine();
                        ItemName.add(NameIn);
                        System.out.print("Loại sản phẩm: ");
                        String TypeIn = scan.nextLine();
                        Itemtype.add(TypeIn);
                        System.out.print("Số lượng sản phẩm: ");
                        int AmountIn = scan.nextInt();
                        scan.nextLine();
                        Amount.add(AmountIn);
                        System.out.print("Giá bán: ");
                        int PriceIn = scan.nextInt();
                        scan.nextLine();
                        Price.add(PriceIn);
                        System.out.print("Số lượng bán: ");
                        int NoIn = scan.nextInt();
                        scan.nextLine();
                        NoSold.add(NoIn);
                        break;
                    case "3":
                        System.out.println("Hãy nhập mã sản phẩm cần tìm: ");
                        int Search = scan.nextInt();
                        boolean Found = ItemCode.contains(Search);
                        if (Found) {
                            int place = ItemCode.indexOf(Search);
                            System.out.println("Hãy nhập thông tin mới của sản phẩm này:");
                            System.out.print("Mã sản phẩm: ");
                            int CodeNew = scan.nextInt();
                            scan.nextLine();
                            ItemCode.set(place, CodeNew);
                            System.out.print("Tên sản phẩm: ");
                            String NameNew = scan.nextLine();
                            ItemName.set(place, NameNew);
                            System.out.print("Loại sản phẩm: ");
                            String TypeNew = scan.nextLine();
                            Itemtype.set(place, TypeNew);
                            System.out.print("Số lượng sản phẩm: ");
                            int AmountNew = scan.nextInt();
                            Amount.set(place, AmountNew);
                            System.out.print("Giá bán: ");
                            int PriceNew = scan.nextInt();
                            scan.nextLine();
                            Price.set(place, PriceNew);
                            System.out.print("Số lượng bán: ");
                            int NoNew = scan.nextInt();
                            scan.nextLine();
                            NoSold.set(place, NoNew);
                            System.out.println("Thay đổi thành công");
                            break;
                        }
                        else{
                            System.out.println("Sản phẩm không tồn tại.");
                        }
                        break;
                    case "4":
                        System.out.println("Hãy nhập mã sản phẩm cần xóa: ");
                        int SearchDel = scan.nextInt();
                        boolean FoundDel = ItemCode.contains(SearchDel);
                        if (FoundDel) {
                            int placeDel = ItemCode.indexOf(SearchDel);
                            ItemCode.remove(placeDel);
                            ItemName.remove(placeDel);
                            Itemtype.remove(placeDel);
                            Amount.remove(placeDel);
                            Price.remove(placeDel);
                            NoSold.remove(placeDel);
                            System.out.println("Đã xóa sản phẩm thành công");
                        }
                        else{
                            System.out.println("Sản phẩm không tồn tại.");
                        }
                        break;
                    case "5":
                        System.out.println("Hãy nhập mã sản phẩm muốn xem: ");
                        int AmmSearch = scan.nextInt();
                        boolean AmmFound = ItemCode.contains(AmmSearch);
                        if (AmmFound) {
                            int placeAmm = ItemCode.indexOf(AmmSearch);
                            System.out.println("Sản phẩm: " + ItemName.get(placeAmm));
                            System.out.println("Số lượng đã bán: " + NoSold.get(placeAmm));
                        }
                        else{
                            System.out.println("Sản phẩm không tồn tại.");
                        }
                        break;
                    case "6":
                        ClearType = removeDuplicates(Itemtype);
                        for (int i = 0; i < ClearType.size(); i++) {
                            System.out.print(ClearType.get(i) + ": ");
                            System.out.println(Collections.frequency(Itemtype, ClearType.get(i)));
                        }
                        break;
                    case "7":
                        ArrayList<String> NameSort = new ArrayList<>(ItemName);
                        Collections.sort(NameSort);
                        for (int i = 0; i < NameSort.size(); i++) {
                            System.out.println(NameSort.get(i));
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        ArrayList<T> newList = new ArrayList<T>();  
        for (T element : list) {
  
            if (!newList.contains(element)) {  
                newList.add(element);
            }
        }  
        return newList;
    }

    public static String Select(String mes){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(mes);
            String str = sc.nextLine();
            return str;
        }
    }
}
