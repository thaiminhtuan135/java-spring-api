package OOP_07;

import java.time.LocalDate;
import java.util.Scanner;

public class Sach {
    public static Scanner sc = new Scanner(System.in);

    private String TenSach;
    private String TheLoaiSach;
    private int Gia;
    private LocalDate NgayXuatBan;
    private String TacGia;

    public Sach() {
        System.out.println("nhap ten sach , the loai sach , gia , ngay xuat ban , tac gia");
        TenSach = sc.nextLine();
        TheLoaiSach = sc.nextLine();
        Gia = sc.nextInt();
        sc.nextLine();
        NgayXuatBan = LocalDate.parse(sc.nextLine());
        TacGia = sc.nextLine();
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTheLoaiSach() {
        return TheLoaiSach;
    }

    public void setTheLoaiSach(String theLoaiSach) {
        TheLoaiSach = theLoaiSach;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public LocalDate getNgayXuatBan() {
        return NgayXuatBan;
    }

    public void setNgayXuatBan(LocalDate ngayXuatBan) {
        NgayXuatBan = ngayXuatBan;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String tacGia) {
        TacGia = tacGia;
    }

    public void InThongTin() {
        System.out.println(TenSach + " là sách " + TheLoaiSach + " có giá: " + Gia + " xuất bản ngày " + NgayXuatBan + " viết bởi " + TacGia);
    }
}
