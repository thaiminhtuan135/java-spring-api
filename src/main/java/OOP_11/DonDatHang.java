package OOP_11;

import java.time.LocalDate;
import java.util.Scanner;

public class DonDatHang {
    public static Scanner sc = new Scanner(System.in);
    private int maSoDon;
    private LocalDate ngayDat;
    private String tenSanPham;
    private double donGia;
    private int soLuong;
    private String ghiChu;
    private double thanhTien;

    public DonDatHang(int maSoDon, LocalDate ngayDat, String tenSanPham, double donGia, int soLuong, String ghiChu, double thanhTien) {
        this.maSoDon = maSoDon;
        this.ngayDat = ngayDat;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
        this.thanhTien = thanhTien;
    }

    public DonDatHang() {
        System.out.println("nhap ma so don , ngay dat , ten san pham ,don gia, so luong , ghi chu");
        maSoDon = sc.nextInt();
        sc.nextLine();
        ngayDat = LocalDate.parse(sc.nextLine());
        tenSanPham = sc.nextLine();
        donGia = sc.nextDouble();
        soLuong = sc.nextInt();
        sc.nextLine();
        ghiChu = sc.nextLine();
        setThanhTien();
    }

    public void inThongTin() {
        System.out.println("Don hang co so " + maSoDon + " dat ngay " + ngayDat + " co tong tien la " + thanhTien);
    }

    public int getMaSoDon() {
        return maSoDon;
    }

    public void setMaSoDon(int maSoDon) {
        this.maSoDon = maSoDon;
    }

    public LocalDate getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(LocalDate ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    private void setThanhTien() {
        thanhTien = donGia*soLuong;
    }
}
