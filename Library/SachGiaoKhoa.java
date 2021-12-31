package Exercises.Library;

public class SachGiaoKhoa extends Book implements IKho,IMuon {
    private int numOfPages;
    private String tinhTrang;
    private int soLuongMuon;

    public SachGiaoKhoa() {}

    @Override
    public void input() {
        super.input();
        System.out.print("Số trang sách: ");
        setNumOfPages(Integer.valueOf(scan.nextLine()));
        System.out.print("Tình trạng sách: ");
        setTinhTrang(scan.nextLine());
        System.out.print("Số lượng cho mượn: ");
        setSoLuongMuon(Integer.valueOf(scan.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + "|Số trang: " + numOfPages + "|Tình trạng:" + tinhTrang + "|Số lượng mượn:"
                + soLuongMuon+"|Vị trí:"+viTri()+"|Tồn kho:"+tonKho();

    }

    @Override
    public int tonKho() {
        return getQuantity() - soLuongMuon;
    }

    @Override
    public String viTri() {
        return "Nằm trong kho A324";
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    public SachGiaoKhoa(int id, String title, String publisher, int yearPublished, int quantity, int numOfPages,
            String tinhTrang, int soLuongMuon) {
        super(id, title, publisher, yearPublished, quantity);
        this.numOfPages = numOfPages;
        this.tinhTrang = tinhTrang;
        this.soLuongMuon = soLuongMuon;
    }

    
    
}