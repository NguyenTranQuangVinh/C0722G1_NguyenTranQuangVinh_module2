package demo_3;

public class Product {
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public Product() {
    }

    public Product(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String getInfo() {
        return this.ten +"," + this.tuoi + "," + this.gioiTinh;
    }
    @Override
    public String toString() {
        return "Product{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
