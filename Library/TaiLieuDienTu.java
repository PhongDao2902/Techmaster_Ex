package Exercises.Library;

public class TaiLieuDienTu extends Book implements IDownload {
    private float dungLuong;
    private int luotTai;
    private float price;

    public TaiLieuDienTu() {}

    @Override
    public void input() {
        super.input();
        System.out.print("Nhập dung lượng(MB): ");
        setDungLuong(scan.nextFloat());
        System.out.print("Nhập số lượt tải: ");
        setLuotTai(scan.nextInt());
        System.out.print("Nhập giá: ");
        setPrice(scan.nextFloat());
    }

    @Override
    public String toString() {
        return super.toString() + "|Dung lượng:" + dungLuong+"MB|Lượt tải:" + luotTai + "|Giá:" + price + "|Tổng tiền: "
                + String.format("%.3f", tongTien());
    }

    @Override
    public float tongTien() {
        return luotTai * price;
    }

    public TaiLieuDienTu(int id, String title, String publisher, int yearPublished, int quantity, float dungLuong,
            int luotTai, float price) {
        super(id, title, publisher, yearPublished, quantity);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.price = price;
    }

    public float getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(float dungLuong) {
        this.dungLuong = dungLuong;
    }

    public int getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
