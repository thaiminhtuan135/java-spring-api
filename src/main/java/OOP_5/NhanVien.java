package OOP_5;

import java.util.Scanner;

public class NhanVien {
    public static Scanner sc = new Scanner(System.in);

    private int maNhanVien;
    private String hoVaTen,phongBan,diaChi, soDienThoai;

    public NhanVien(int maNhanVien, String hoVaTen, String phongBan, String diaChi, String soDienThoai) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.phongBan = phongBan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public NhanVien() {
        System.out.println("nhap ma nhan vien , ten , phong ban , dia chi , sdt");
        maNhanVien = sc.nextInt();
        sc.nextLine();
        hoVaTen = sc.nextLine();
        phongBan = sc.nextLine();
        diaChi = sc.nextLine();
        soDienThoai = sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("nhan vien" + hoVaTen + "thuoc phong ban "+ phongBan+" co so dien thoai la " + soDienThoai);
    }
    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
