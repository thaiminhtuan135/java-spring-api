package OOP_20;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class TaiLieu {
    public static Scanner sc = new Scanner(System.in);

    protected int maTaiLieu;
    protected String tenNhaXuatBan;
    protected int soBanPhatHanh;


    public TaiLieu(int maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public TaiLieu() {
        System.out.println("nhap ma tai lieu , ten nha xuat ban , so ban phat hanh");
        maTaiLieu = sc.nextInt();
        sc.nextLine();
        tenNhaXuatBan = sc.nextLine();
        soBanPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public void in() {
        System.out.print("ma tai lieu " + maTaiLieu + " ten nha xuat ban " + tenNhaXuatBan + " so ban phat hang " + soBanPhatHanh);
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(int maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
}
