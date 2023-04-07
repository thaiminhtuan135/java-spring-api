import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HocVien {
    public static Scanner scanner = new Scanner(System.in);

    private int MaHocVien;
    private String HoTen, Ho, Email;
    private LocalDate NgaySinh;
    private Double HocPhi;

    public HocVien() {
        System.out.println("nhap ma , ho ten , hoc phi , ngay sinh");
        MaHocVien = scanner.nextInt();
        scanner.nextLine();
        HoTen = scanner.nextLine();
        HocPhi = scanner.nextDouble();
        scanner.nextLine();
        NgaySinh = LocalDate.parse(scanner.nextLine());
    }

    public HocVien(int maHocVien, String hoTen, String ho, String email, LocalDate ngaySinh, Double hocPhi) {
        MaHocVien = maHocVien;
        HoTen = hoTen;
        Ho = ho;
        Email = email;
        NgaySinh = ngaySinh;
        HocPhi = hocPhi;
    }

    public int getMaHocVien() {
        return MaHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        MaHocVien = maHocVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        Ho = ho;
    }

    public String getEmail() {
        setEmail();
        return Email;
    }

    public void setEmail() {
        Email = HoTen.replace(" ", "").toLowerCase() + "@edusolution.com";
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public Double getHocPhi() {
        setHocPhi(HocPhi);
        return HocPhi;
    }

    public void setHocPhi(Double hocPhi) {
        if (hocPhi > 3000000) {
            this.HocPhi = hocPhi * 0.95;
        }
    }

    public void inThongTin() {
        System.out.println(HoTen + "sinh ngay " + NgaySinh + "co email la " + getEmail() + " hoc phi " + getHocPhi());
    }

    public static List<HocVien> TimKiemHocVien(List<HocVien> list) {
        return list.stream().filter(s -> s.getHoTen().contains("Tuan")).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        HocVien hocVien = new HocVien();
        hocVien.inThongTin();
        List<HocVien> list = new ArrayList<>();
        list.add(hocVien);
        list.add(new HocVien());
        list.add(new HocVien());

        List<HocVien> hocViens = HocVien.TimKiemHocVien(list);
        hocViens.forEach(HocVien::inThongTin);
    }
}
