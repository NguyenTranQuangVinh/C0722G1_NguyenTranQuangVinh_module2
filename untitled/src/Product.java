public class Product {
    private String ten;
    private String gia;
    private String hangSanXuat;
    private String noiSanXuat;

    public Product() {
    }

    public Product(String ten, String gia, String hangSanXuat, String noiSanXuat) {
        this.ten = ten;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
        this.noiSanXuat = noiSanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ten='" + ten + '\'' +
                ", gia='" + gia + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", noiSanXuat='" + noiSanXuat + '\'' +
                '}';
    }
}
