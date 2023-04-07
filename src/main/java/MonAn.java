import java.util.Scanner;

public class MonAn {
    public static Scanner scanner = new Scanner(System.in);
    private String tenMonAn;
    private int GiaBan;
    private String GioiThieu;
    private String NguyenLieuChinh;

    public MonAn() {
        System.out.println("nhap ten mon , gia ban , gioi thieu , nguyen lieu chinh : ");
        tenMonAn = scanner.nextLine();
        GiaBan = scanner.nextInt();
        scanner.nextLine();
        GioiThieu = scanner.nextLine();
        NguyenLieuChinh = scanner.nextLine();
    }

    public void xuat() {
        System.out.println(tenMonAn + ", " + GioiThieu + " duoc lam tu " + NguyenLieuChinh);
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int giaBan) {
        GiaBan = giaBan;
    }

    public String getGioiThieu() {
        return GioiThieu;
    }

    public void setGioiThieu(String gioiThieu) {
        GioiThieu = gioiThieu;
    }

    public String getNguyenLieuChinh() {
        return NguyenLieuChinh;
    }

    public void setNguyenLieuChinh(String nguyenLieuChinh) {
        NguyenLieuChinh = nguyenLieuChinh;
    }

    public static void main(String[] args) {
        MonAn monAn = new MonAn();
        monAn.xuat();
    }
}
