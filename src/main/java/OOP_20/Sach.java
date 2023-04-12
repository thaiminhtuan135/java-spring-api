package OOP_20;

import java.util.List;
import java.util.stream.Collectors;

public class Sach extends TaiLieu{
    private String tenSach , tenTacGia;
    private int soTrang;

    public Sach(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenSach, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach() {
        super();
        System.out.println("nhap ten sach , ten tac gia , so trang");
        tenSach = sc.nextLine();
        tenTacGia = sc.nextLine();
        soTrang = sc.nextInt();
    }

    public void inThongTin() {
        in();
        System.out.println("ten sach " + tenSach + "ten tac gia " + tenTacGia + " so trang " + soTrang);
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public static void timkiem(List<Sach> list, String name) {
         list.stream().filter(s -> s.getTenSach().contains(name)).forEach(s -> s.inThongTin());
    }
}
