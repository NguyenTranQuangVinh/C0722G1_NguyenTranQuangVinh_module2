package demo_2;

public class Product {
    private String ten;
    private String ngayThangNamSinh;
    private String diaChi;

    public Product() {
    }

    public Product(String ten, String ngayThangNamSinh, String diaChi) {
        this.ten = ten;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(String ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ten='" + ten + '\'' +
                ", ngayThangNamSinh='" + ngayThangNamSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
