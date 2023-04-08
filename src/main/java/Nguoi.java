import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nguoi {
    public static Scanner sc = new Scanner(System.in);
    private int maSo;
    private String hoTen, ho, dem, ten;
    private LocalDate ngaySinh;

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getDem() {
        return dem;
    }

    public void setDem(String dem) {
        this.dem = dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    private String taoDulieu(String s) {
        if (hoTen == null || s.compareTo(hoTen) != 0) {
            return s;
        }
        return hoTen;
    }

    public void setHoDemTen() {
        String[] arr = hoTen.split(" ");
        ho = arr[0];
        ten = arr[arr.length - 1];
        dem = "";
        for (int i = 1; i < arr.length - 1; i++) {
            dem += arr[i] + " ";
        }
    }

    public Nguoi() {
        System.out.println("Nhap ma so , ho ten , ngay sinh");
        maSo = sc.nextInt();
        sc.nextLine();
        hoTen = taoDulieu(sc.nextLine());
        ngaySinh = LocalDate.parse(sc.nextLine());
        setHoDemTen();
    }

    public void inThongTin() {
        System.out.println(maSo + " co ho ten la " + hoTen + " sinh ngay " + ngaySinh);
    }
    public Nguoi(int maSo, String hoTen, LocalDate ngaySinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        setHoDemTen();
    }

    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        List<Nguoi> list = new ArrayList<>();
        list.add(nguoi);
        LocalDate localDate = LocalDate.of(2000, 2 , 2);
        list.add(new Nguoi(123, "Thai Minh Tuan", localDate));
        list.add(new Nguoi(123, "Jame", localDate));
        list.add(new Nguoi(123, "Anatoly", localDate));
        list.forEach(Nguoi::inThongTin);

    }
}
