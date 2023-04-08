import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocSinh {
    public static Scanner sc = new Scanner(System.in);
    private String hoTen, lop;
    private LocalDate ngaySinh;
    private double diemToan, diemVan, diemAnh, sumAverage;

    public HocSinh(String hoTen, String lop, LocalDate ngaySinh, float diemToan, float diemVan, float diemAnh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        setSumAverage();
    }

    public HocSinh() {
        System.out.println("nhap ho ten , lop , ngay sinh , diem toan , diem van , diem anh");
        hoTen = sc.nextLine();
        lop = sc.nextLine();
        ngaySinh = LocalDate.parse(sc.nextLine());
        diemToan = sc.nextDouble();
        diemVan = sc.nextDouble();
        diemAnh = sc.nextDouble();
        setSumAverage();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    public double getSumAverage() {
        return sumAverage;
    }

    public void setSumAverage() {
        this.sumAverage = (this.diemAnh + this.diemVan + this.diemAnh) / 3;
    }

    public void InthongTin() {
        System.out.println(hoTen+ " hoc lop "+ lop+" ,co diem trung binh la "+sumAverage);
    }
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh();
        List<HocSinh> list = new ArrayList<>();
        list.add(hocSinh);
        LocalDate localDate = LocalDate.of(2000, 2, 2);
        list.add(new HocSinh("Minh Tuan","AT168", localDate,6,7,8));
        list.add(new HocSinh("Thai Tuan","AT168", localDate,8,7,4));
        list.add(new HocSinh("Jame ","AT168", localDate,4,7,10));
        list.forEach(HocSinh::InthongTin);
    }
}
