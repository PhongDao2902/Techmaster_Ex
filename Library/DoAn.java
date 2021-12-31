package Exercises.Library;

public class DoAn extends Book implements IKho{
    
    private int numOfPages;
    private String tinhTrang;
    private int yearProtected;

    public DoAn(){}

    @Override
    public void input() {
        super.input();
        System.out.print("Số trang sách : ");
        setNumOfPages(Integer.valueOf(scan.nextLine()));
        System.out.print("Tình trạng sách : ");
        setTinhTrang(scan.nextLine());
        System.out.print("Số lượng cho mượn : ");
        setYearProtected(Integer.valueOf(scan.nextLine()));
    }

    @Override
    public String toString() {
        return super.toString() + "|Số trang: "+numOfPages+ "|Tình trạng: "+tinhTrang+"|Năm bảo vệ:"+yearProtected + "|Vị trí:"+viTri();
    }

    @Override
    public String viTri() {
        return "Kho A28";
    }

    public DoAn(int id, String title, String publisher, int yearPublished, int quantity, int numOfPages,
            String tinhTrang, int yearProtected) {
        super(id, title, publisher, yearPublished, quantity);
        this.numOfPages = numOfPages;
        this.tinhTrang = tinhTrang;
        this.yearProtected = yearProtected;
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

    public int getYearProtected() {
        return yearProtected;
    }

    public void setYearProtected(int yearProtected) {
        this.yearProtected = yearProtected;
    }
    
}
