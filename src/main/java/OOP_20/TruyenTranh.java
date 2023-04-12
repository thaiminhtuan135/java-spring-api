package OOP_20;

import java.util.List;

public class TruyenTranh extends TaiLieu{
    private String tenTruyen;
    private int thangPhatHanh;

    public TruyenTranh(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTruyen, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTruyen = tenTruyen;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TruyenTranh() {
        super();
        System.out.println("nhap ten truyen , ngay phat hanh");
        tenTruyen = sc.nextLine();
        thangPhatHanh = sc.nextInt();
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    public void inThongTin() {
        System.out.println("ten truyen "+ tenTruyen+ "thagn phat hanh"+thangPhatHanh);
    }
    public static void timkiem(List<TruyenTranh> list, String name) {
        list.stream().filter(s -> s.getTenTruyen().contains(name)).forEach(s -> s.inThongTin());
    }
}
